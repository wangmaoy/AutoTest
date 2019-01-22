package com.interfacedemo.fbajxx.cases;

import com.alibaba.fastjson.JSON;
import com.interfacedemo.fbajxx.model.Ajxx;
import com.interfacedemo.fbajxx.model.Fbajxx;
import com.interfacedemo.fbajxx.model.InterfaceName;
import com.interfacedemo.fbajxx.model.Result;
import com.interfacedemo.fbajxx.utils.JsonAndJavaBeanTool;
import com.interfacedemo.fbajxx.config.TestConfig;
import com.interfacedemo.fbajxx.dao.TAjAll;
import com.interfacedemo.fbajxx.utils.ConfigFile;
import com.interfacedemo.fbajxx.utils.DatabaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import com.alibaba.fastjson.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FbajxxTest {
    @BeforeTest
    public void beforeTest(){
        TestConfig.defaultHttpClient=new DefaultHttpClient();
        TestConfig.fbajxxUrl=ConfigFile.getUrl(InterfaceName.FBAJXX);
    }
    @Test
    public void fbajxxTest(){
        //mysql sqlSesson
        SqlSession sqlSession= DatabaseUtil.getSqlSession();
        //查询用例库中一共多少用例
        int count=sqlSession.selectOne("fbajxx_count");
        //获取postgresql 的sqlsession
        SqlSession fbSqlSesson=DatabaseUtil.getFbSqlSession();
        for(int i=1;i<=count;i++){
            //循环获取测试用例
            Fbajxx fbajxx=sqlSession.selectOne("fbajxx_01",i);
            //请求接口，得到返回结果
            String responseResult=getFbajxxResult(fbajxx);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Boolean.parseBoolean(fbajxx.getDatacompare()) ==true){
                //去源数据库查询 满足条件的一共多少条数据
                int ajcount=fbSqlSesson.selectOne("database_count",fbajxx);
                //Assert.assertTrue(true,responseResult.concat(fbajxx.getExpected()));
                Result resultBean= JsonAndJavaBeanTool.jsonTransfer(responseResult);
                //断言 接口返回的count 与数据库中的是否一致
                Assert.assertEquals(resultBean.getCount(),ajcount);
                //判断接口返回案件信息字段 与 数据库中查询的是否一致
                List<TAjAll> tAjAllList=new ArrayList<TAjAll>();
                //根据请求条件查询出 案件信息列表
                tAjAllList= fbSqlSesson.selectList("ajxxlist",fbajxx);
                boolean compareResult=compare(tAjAllList,resultBean);
                Assert.assertEquals(Boolean.parseBoolean(fbajxx.getExpected()),compareResult);
            }else{
                JSONObject jsonObject= JSON.parseObject(responseResult);
                String success=jsonObject.getString("success");
                Assert.assertEquals(success,fbajxx.getExpected());
            }
            System.out.println("第"+i+"个用例"+fbajxx.getCasename()+"  执行成功");
        }
    }
    private boolean compare(List<TAjAll> tAjAllList,Result result){
        List<Ajxx> ajxxes=result.getAjList();
        if(tAjAllList.size()!=ajxxes.size()){
            System.out.println("数据库中查询条数与接口返回案件条数不一致");
            return false;
        }
        int flag=tAjAllList.size();
        for(TAjAll tAjAll:tAjAllList){
            for(Ajxx ajxx:ajxxes){
                if(tAjAll.getC_ajbh()==ajxx.getCAjbh()&&tAjAll.getC_ah()==ajxx.getCAh()&&String.valueOf(tAjAll.getN_jbfybs())==ajxx.getNJbfy()){
                   break;
                }
            }
            flag--;
        }
        if(flag==0){
            return true;
        }else{
            return false;
        }

    }
    private String getFbajxxResult(Fbajxx fbajxx){
        //发送请求
        HttpPost post=new HttpPost(TestConfig.fbajxxUrl);
        //System.out.println(TestConfig.fbajxxUrl);
        JSONObject param=new JSONObject();
        param.put("fyId",fbajxx.getFyid());
        param.put("gxrq",fbajxx.getGxrq());
        param.put("ajlx",fbajxx.getAjlx());
        param.put("slly",fbajxx.getSlly());
        param.put("pageNo",fbajxx.getPageNo());
        param.put("pageSize",fbajxx.getPageSize());
        //设置信息头，设置header
        post.setHeader("Content-Type","application/json;charset=UTF-8");
        StringEntity entity= new StringEntity(param.toString(),"utf-8");;
        post.setEntity(entity);
        //声明一个对象来进行相应结果的存储
        String result=null;
        //执行post方法
        HttpResponse response=null;
        try {
            response=TestConfig.defaultHttpClient.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取相应结果
        try {
            result= EntityUtils.toString(response.getEntity(),"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
