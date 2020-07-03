package com.selenium.sjzj.base;

import org.openqa.selenium.*;

import java.util.List;
import java.util.Set;

/**
 * driver 及 driver 下的一些常用方法的封装 比如 窗口最大化，打开url  查找元素
 */
public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser){
        this.driver=SelectDriver.getDriver(browser);
    }
    /**
     * 窗口最大化
     */
    public void getMaxWindow(){
        this.driver.manage().window().maximize();
    }

    /**
     * 打开url地址
     * @param url
     */
    public void getUrl(String url){
        this.driver.get(url);
    }
    /**
     * findelement 方法封装
     */
    public WebElement findElement(By by){
        return this.driver.findElement(by);
    }
    /**
     * 关闭当前窗口
     */
    public void close(){
        this.driver.close();
    }
    /**
     * 关闭当前driver
     */
    public void quit(){this.driver.quit();}
    /**
     * 获取cookies
     */
    public Set<Cookie>  getCookie(){
        Set<Cookie> cookies= driver.manage().getCookies();
        return cookies;
    }
    /**
     *切换alert 并同意
     */
    public void acceptAlert(){
        Alert alert=this.driver.switchTo().alert();
        alert.accept();
    }
    /**
     * 判断是否有alert 弹出框
     */
    public boolean isAlertPresent(){
        try {
            this.driver.switchTo().alert();
            return true;
        }catch (NoAlertPresentException Ex)
            {
                return false;
            }
        }

    /**
     * 添加cookie
     */
    public void setCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }
    /**
     * 切换fram
     */
    public void switchFrame(WebElement webElement){
        driver.switchTo().frame(webElement);
    }

    public List<WebElement> findElements(By by){

        return driver.findElements(by);
    }

}
