package com.selenium.sjzj.handle;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.HomePage;
import org.openqa.selenium.WebElement;

public class HomePageHandle {
    private HomePage homePage;
    public HomePageHandle(DriverBase driverBase){
        this.homePage=new HomePage(driverBase);
    }
    /**
     * 找到规则配置页签，点击规则配置
     */
    public void clickGzpzTap(){
        homePage.click(homePage.getGzpzElement());
    }
    /**
     * 获取的左上方 用户名文本
     */
    public String getHomeUserText(){
        return homePage.getText(homePage.getHomeUserText());
    }
}
