package cn.wmy.selenium.page;

import cn.wmy.selenium.base.DriverBase;
import cn.wmy.selenium.util.GetByLocator;
import cn.wmy.selenium.util.ProUtil;
import com.gargoylesoftware.htmlunit.javascript.host.canvas.ext.WEBGL_debug_renderer_info;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

/**
 * 页面有多少个元素对象，都在这里面写，比如登录页面 我只需要用户名、密码、登录按钮
 */
public class LoginPage extends  BasePage{
    //构造方法 获取driver
    /**
     * 用户名
     */
    public LoginPage(DriverBase driverBase){
        super(driverBase);
    }

    /**
     * 返回登录页面用户名元素
     * @return
     */
    public WebElement getUserElement(){
        return element(GetByLocator.getLocator("username")) ;
    }
    /**
     * 返回登录页面密码元素
     */
    public WebElement getPassword(){
        return element(GetByLocator.getLocator("password"));
    }
    /**
     * 返回登录页面按钮元素
     */
    public WebElement getLoginButton(){
        return element(GetByLocator.getLocator("loginbutton"));
    }
    /**
     * 返回手机动态登录元素
     */
    public WebElement getDynamicLink(){
        return element(GetByLocator.getLocator("dynamic"));
    }
}
