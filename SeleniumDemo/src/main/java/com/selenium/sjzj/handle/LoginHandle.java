package com.selenium.sjzj.handle;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.LoginPage;
import org.openqa.selenium.WebElement;

public class LoginHandle {
    private LoginPage lp;
    public LoginHandle(DriverBase driverBase){
        this.lp=new LoginPage(driverBase);
    }
    /**
     * 找到user元素并输入用户名
     */
    public void sendKeysUser(String username){
        WebElement webElement=lp.getUserNameElement();
        lp.elementSendKeys(lp.getUserNameElement(),username);
    }
    /**
     * 找到password元素并输入密码
     */
    public void sendKeysPassword(String password){
        lp.elementSendKeys(lp.getPasswordElement(),password);
    }
    /**
     * 找到登录元素，并点击登录按钮
     */
    public void clickLoginButton(){
        lp.click(lp.getLoginButton());
    }
    /**
     * 判断是否是登录界面 通过判断是否有用户名元素
     */
    public boolean assertLoginPage(){
        return lp.assertElmentIs(lp.getUserNameElement());
    }

}
