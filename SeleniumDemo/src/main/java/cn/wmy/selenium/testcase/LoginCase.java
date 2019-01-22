package cn.wmy.selenium.testcase;

import cn.wmy.selenium.base.DriverBase;
import cn.wmy.selenium.business.LoginPro;
import cn.wmy.selenium.util.GetByLocator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginCase {
    private DriverBase driverBase;
    private LoginPro lp;
    public LoginCase(){
        driverBase=new DriverBase("chrome");
        lp=new LoginPro(driverBase);
    }
    @Test
    public void loginTestCase(){
        //driverBase.getUrl("https://passport.ctrip.com/user/login?BackUrl=http%3A%2F%2Fwww.ctrip.com%2F%3Fallianceid%3D14666%26sid%3D418533%26ouid%3D000401app-%26utm_medium%3D%26utm_campaign%3D%26utm_source%3D%26isctrip%3D");
        driverBase.getUrl("https://study.163.com/");
        driverBase.getMaxWindow();
        WebElement element=driverBase.findElement(GetByLocator.getLocator("zhlogin"));
        element.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driverBase.switchWindow();
        System.out.println("访问页面成功，开始登录");
        lp.login("18801260718","dbly417dx");

    }
}
