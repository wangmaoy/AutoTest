package com.selenium.sjzj.page;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;;

/**
 * 登录界面的各元素封装,返回的结果为WebElement
 */
public class LoginPage extends BasePage {
    public LoginPage(DriverBase driverBase){
        super(driverBase);
    }

    /**
     *获取登录界面用户名元素
     */
    public WebElement getUserNameElement(){
        return findelement(GetByLocator.getByLocator("login_username"));
    }
    /**
     *获取登录界面密码元素
     */
    public WebElement getPasswordElement(){
        return findelement(GetByLocator.getByLocator("login_password"));
    }
    /**
     * 获取登录界面登录按钮
     */
    public WebElement getLoginButton(){
        return findelement(GetByLocator.getByLocator("login_loginbutton"));
    }
}
