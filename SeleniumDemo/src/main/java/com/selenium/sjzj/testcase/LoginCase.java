package com.selenium.sjzj.testcase;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.business.BussinessPro;
import com.selenium.sjzj.business.XtglSjyglPro;
import com.selenium.sjzj.util.ParamValueUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginCase {
    private DriverBase driverBase;
    private BussinessPro bussinessPro;
    private XtglSjyglPro xtglSjyglPro;
    private List<Map<String,String>> datas;
    public LoginCase(){
        this.driverBase=new DriverBase("chrome");
        this.bussinessPro =new BussinessPro(driverBase);
        this.xtglSjyglPro=new XtglSjyglPro(driverBase);
        /**
        Map<String,String> map=new HashMap<>();
        map.put("sjylx","ArteryBase");
        map.put("sjymc","artbase自动化");
        map.put("jdbcurl","jdbc:ArteryBase://172.16.32.221:5432/zhitu");
        map.put("username","artbase");
        map.put("password","123456");
        map.put("gzmc","自动化规则名称");
        map.put("zjdx","select c_id from db_test.t_gxjh");
        map.put("gzsql","n_jafs is null");
        datas.add(map);
         **/
    }
    @BeforeMethod
    /**
     * 登录--打开规则配置界面
     */
    public void loginCase(){
        driverBase.getMaxWindow();
        driverBase.getUrl("ip");
        bussinessPro.login("dsj","12345678Aa");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 新增数据源
     */
    @Test
    public void addSjy() throws InterruptedException {
        xtglSjyglPro.addSjy("ArteryBase");
    }
    @Test
    /**
     * 自定义规则用例
     */
    public void zdygzCase(){
        String gzmc= ParamValueUtil.gzmc();
        String gzsm=ParamValueUtil.gzsm();
        String zjdx="select c_id from db_test.t_gxjh";
        String gzsql="n_jafs is null";
        //规则配置第一步
        bussinessPro.fstepPro(gzmc,gzsm);
        //规则配置第2步 预定义
        //lpro.sstepPro();
        //规则配置第2步 自定义
        bussinessPro.zdygz(gzmc,zjdx,gzsql);
        //规则配置第3步
        bussinessPro.tstepPro();
    }
    @Test
    /**
     * 预定义规则用例
     */
    public void ydygzCase(){
        String gzmc= ParamValueUtil.gzmc();
        String gzsm=ParamValueUtil.gzsm();
        //规则配置第一步
        bussinessPro.fstepPro(gzmc,gzsm);
        //规则配置第2步 预定义
        bussinessPro.sstepPro();
        //规则配置第3步
        bussinessPro.tstepPro();
    }

}
