package cn.wmy.selenium.business;

import cn.wmy.selenium.base.DriverBase;
import cn.wmy.selenium.handle.LoginHandle;

public class LoginPro {
    private LoginHandle lh;
    public LoginPro(DriverBase driverBase){
        this.lh=new LoginHandle(driverBase);
    }
    public void login(String username,String pass){
        if(lh.displayLogin()){
            lh.sendKeyUser(username);
            lh.sendKeyPass(pass);
            lh.clickLoginButton();
        }else{
            System.out.println("loginpage页面不存在");
        }
    }
}
