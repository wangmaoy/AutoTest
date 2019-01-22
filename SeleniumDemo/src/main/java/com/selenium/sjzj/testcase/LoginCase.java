package com.selenium.sjzj.testcase;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.business.BussinessPro;
import com.selenium.sjzj.util.ParamValueUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginCase {
    private DriverBase driverBase;
    private BussinessPro bussinessPro;
    public LoginCase(){
        this.driverBase=new DriverBase("chrome");
        this.bussinessPro =new BussinessPro(driverBase);
    }
    @BeforeMethod
    /**
     * 登录--打开规则配置界面
     */
    public void loginCase(){
        driverBase.getMaxWindow();
        driverBase.getUrl("http://tap.thunisoft.com/ssoserver/login?service=http://172.16.176.216:19999/sjzj/cas");
        bussinessPro.login("dengzhigang","123");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    /**
     * 自定义规则用例
     */
    public void zdygzCase(){
        String gzmc= ParamValueUtil.gzmc();
        String gzsm=ParamValueUtil.gzsm();
        //规则配置第一步
        bussinessPro.fstepPro(gzmc,gzsm);
        //规则配置第2步 预定义
        //lpro.sstepPro();
        //规则配置第2步 自定义
        bussinessPro.zdygz();
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
