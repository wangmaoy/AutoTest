package cn.wmy.selenium.page;

import cn.wmy.selenium.base.DriverBase;
import cn.wmy.selenium.base.SelectDriver;
import cn.wmy.selenium.business.LoginPro;
import cn.wmy.selenium.handle.LoginHandle;
import cn.wmy.selenium.util.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.rmi.runtime.Log;

public class PageTest {
    public static void main(String args[]){
        login();

    }
    public static void login() {
        DriverBase driver = new DriverBase("chrome");
        LoginPro lp=new LoginPro(driver);
        driver.getUrl("https://passport.ctrip.com/user/login?BackUrl=http%3A%2F%2Fwww.ctrip.com%2F%3Fallianceid%3D14666%26sid%3D418533%26ouid%3D000401app-%26utm_medium%3D%26utm_campaign%3D%26utm_source%3D%26isctrip%3D");
        lp.login("18801260718","dbly417dx");
        System.out.println("登录用户"+"18801260718");
    }
}
