package cn.wmy.selenium.page;

import cn.wmy.selenium.base.DriverBase;
import cn.wmy.selenium.base.SelectDriver;
import cn.wmy.selenium.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    DriverBase driverBase;
    public RegisterPage(){
        this.driverBase=new DriverBase("chrome");
    }
    public void register(){
        driverBase.getUrl("https://passport.ctrip.com/user/reg/home");
        WebElement agreeElement=driverBase.findElement(GetByLocator.getLocator("agreebutton"));
        agreeElement.click();
    }
}
