package com.tester.cases;
import com.tester.config.TestConfig;
import com.tester.model.AddUserCase;
import com.tester.model.User;
import com.tester.utils.DatabaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
public class AddUserTest {
    @Test(dependsOnGroups = "loginTrue",description = "添加用户接口接口")
    public void addUser() throws IOException, InterruptedException {
        SqlSession session = DatabaseUtil.getSqlSession();
        AddUserCase addUserCase = session.selectOne("addUserCase",1);
        System.out.println(addUserCase.toString());
        System.out.println(TestConfig.addUserUrl);
        //发请求getResult，获取结果 下边的代码为写完接口的测试代码,getResult是去调用接口发送请求，这个的时间不是能控制的，所以
        //最好加上线程等待时间，待数据完全返回后，再执行下面的语句
        String result = getResult(addUserCase);
        //验证返回结果
        /**
         * 可以先讲
         */
        //查询用户看是否添加成功
        Thread.sleep(3000);
        //addUser 是自己获取的，会在mapper里面写，而addUserCase 是测试用例的
        User user = session.selectOne("addUser",addUserCase);
        System.out.println(user.toString());
        //处理结果，就是判断返回结果是否符合预期 预期：addUserCase.getExpected() 实际：result
        Assert.assertEquals(addUserCase.getExpected(),result);
    }
    // 真正发请求的代码
    private String getResult(AddUserCase addUserCase) throws IOException {
        //下边的代码为写完接口的测试代码
        //发送请求
        HttpPost post = new HttpPost(TestConfig.addUserUrl);
        JSONObject param = new JSONObject();
        param.put("userName",addUserCase.getUserName());
        param.put("password",addUserCase.getPassword());
        param.put("sex",addUserCase.getSex());
        param.put("age",addUserCase.getAge());
        param.put("permission",addUserCase.getPermission());
        param.put("isDelete",addUserCase.getIsDelete());
        //设置请求头信息 设置header
        post.setHeader("content-type","application/json");
        //将参数信息添加到方法中
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        //设置cookies
        TestConfig.defaultHttpClient.setCookieStore(TestConfig.store);
        //声明一个对象来进行响应结果的存储
        String result;
        //执行post方法
        HttpResponse response = TestConfig.defaultHttpClient.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        return result;
    }



}
