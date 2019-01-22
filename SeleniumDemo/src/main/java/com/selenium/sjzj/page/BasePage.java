package com.selenium.sjzj.page;


import com.selenium.sjzj.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 每个页面都会用到的元素的公用方法的封装 比如元素点击 元素输入框赋值
 */
public class BasePage {
    private DriverBase driverBase;
    public BasePage(DriverBase driverBase){
        this.driverBase=driverBase;
    }
    /**
     * 元素点击
     */
    public void click(WebElement element){
        if(element!=null){
            element.click();
        }else{
            System.out.println("未定位到元素");
        }
    }
    /**
     * 元素sendkeys
     */
    public void elementSendKeys(WebElement element,String value){
        if(element!=null){
            element.sendKeys(value);
        }else{
            System.out.println("此元素未定位到");
        }
    }
    /**
     * driver的findElement
     */
     public WebElement findelement(By by){
        return driverBase.findElement(by);
    }
    /**
     * 判断元素是否显示
     */
    public boolean assertElmentIs(WebElement element){
        return element.isDisplayed();
    }
    /**
     * 判断元素是否可操作
     */
    public boolean elementEnabled(WebElement element){
        return element.isEnabled();
    }
    /**
     * 获得元素的文本信息
     */
    public String  getText(WebElement element){
        return element.getText();
    }
}
