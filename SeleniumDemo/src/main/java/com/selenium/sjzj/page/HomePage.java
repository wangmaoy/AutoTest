package com.selenium.sjzj.page;


import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class HomePage  extends BasePage{
    public HomePage(DriverBase driverBase){super(driverBase);}
    /**
     * 规则配置页签元素
     */
    public WebElement getGzpzElement(){
        return findelement(GetByLocator.getByLocator("gzpz_tap"));
    }
    /**
     * 首页 左上方用户名元素
     */
    public WebElement getHomeUserText(){
        return findelement(GetByLocator.getByLocator("home_user_text"));
    }
}
