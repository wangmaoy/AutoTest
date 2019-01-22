package cn.wmy.selenium.handle;

import cn.wmy.selenium.base.DriverBase;
import cn.wmy.selenium.page.LoginPage;

/**
 * 3-18 登录po设计模式代码 loginPageHandel
 * 完成对页面元素的操作,操作loginpage 下的各方法 比如输入用户名和实际的密码值
 * 所以要引入LoginPage ,并定义变量
 * 判断元素存不存在 是在业务层，不在操作层处理
 */
public class LoginHandle {
    private LoginPage lp;
    public LoginHandle(DriverBase driverBase){
        lp=new LoginPage(driverBase);
    }
    /**
     *输入用户名
     */
    public void sendKeyUser(String username){
        lp.sendKey(lp.getUserElement(),username);
    }
    /**
     * 输入密码
     */
    public void sendKeyPass(String password){
        lp.sendKey(lp.getPassword(),password);
    }
    /**
     * 点击登录按钮 登录
     */
    public void clickLoginButton(){
        lp.click(lp.getLoginButton());
    }
    /**
     * 点击手机登录链接
     */
    public void clickDynamicLink(){
        lp.click(lp.getDynamicLink());
    }
    /**
     * 判断是否是登录页面
     */
    public boolean displayLogin(){
        return lp.isElementDisplay(lp.getUserElement());
    }
}
