package com.selenium.sjzj.testcase;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.business.HomePagePro;
import com.selenium.sjzj.business.LoginPro;
import com.selenium.sjzj.util.HandleCookieUtil;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class SuiteTestLogin {
    public DriverBase driverBase;
    public LoginPro loginPro;
    public HomePagePro homePagePro;
    public HandleCookieUtil handleCookieUtil;
    @BeforeClass
    public void beforeClass(){
        this.driverBase=new DriverBase("chrome");
        this.loginPro=new LoginPro(driverBase);
        this.homePagePro=new HomePagePro(driverBase);
        this.handleCookieUtil=new HandleCookieUtil(driverBase);
        this.driverBase.getUrl("http://tap.thunisoft.com/ssoserver/login?service=http://172.16.176.216:19999/sjzj/cas");
        this.driverBase.getMaxWindow();
    }
    @Test
    public void testLogin(){
        loginPro.sjzjLogin("liudehua","123");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(driverBase.isAlertPresent()){
            driverBase.acceptAlert();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String username="刘德华";
        if(homePagePro.assertLoginUser(username)){
            System.out.println("登录成功"+username);
            //将cookie写入cookie.properties
            this.handleCookieUtil.writeCookie();
        }
    }
    @AfterClass
    public void afterClass(){
        driverBase.quit();
    }

}
