package com.selenium.sjzj.business;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.handle.LoginHandle;

public class LoginPro {
    private LoginHandle loginHandle;
    public LoginPro(DriverBase driverBase){
        this.loginHandle=new LoginHandle(driverBase);
    }
    /**
     * 登录方法 ，参数值为用户名密码
     */
    public void sjzjLogin(String name,String password){
        if(loginHandle.assertLoginPage()){
            loginHandle.sendKeysUser(name);
            loginHandle.sendKeysPassword(password);
            loginHandle.clickLoginButton();
        }else{
            System.out.println("页面不存在或状态不正确！！");
        }
    }

}
