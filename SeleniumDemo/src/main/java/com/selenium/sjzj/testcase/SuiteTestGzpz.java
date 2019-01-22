package com.selenium.sjzj.testcase;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.business.HomePagePro;
import com.selenium.sjzj.business.LoginPro;
import com.selenium.sjzj.util.HandleCookieUtil;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class SuiteTestGzpz {
    public DriverBase driverBase;
    public LoginPro loginPro;
    public HomePagePro homePagePro;
    public String JSESSIONID;
    @BeforeClass
    public void beforeClass(){

}
    @Test
    public void testLogin(){
        this.driverBase=new DriverBase("chrome");
        this.loginPro=new LoginPro(driverBase);
        this.homePagePro=new HomePagePro(driverBase);
        this.driverBase.getUrl("http://tap.thunisoft.com/ssoserver/login?service=http://172.16.176.216:19999/sjzj/cas");
        loginPro.sjzjLogin("liudehua","123");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(driverBase.isAlertPresent()){
            driverBase.acceptAlert();
        }
        String username="刘德华";
        if(homePagePro.assertLoginUser(username)){
            System.out.println("登录成功"+username);
        }
        HandleCookieUtil handleCookieUtil=new HandleCookieUtil(driverBase);
        handleCookieUtil.writeCookie();
        driverBase.close();
        this.driverBase=new DriverBase("chrome");
        this.driverBase.getUrl("http://172.16.176.216:19999/sjzj/gzpz");
        HandleCookieUtil h2=new HandleCookieUtil(driverBase);
        h2.setCookie();
        this.driverBase.getUrl("http://172.16.176.216:19999/sjzj/gzpz");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.driverBase.getUrl("http://172.16.176.216:19999/sjzj/gzpz/newRuleStep01");
    }
    @AfterClass
    public void asertClass(){
        driverBase.close();

    }
}
