package cn.wmy.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * driver 的一些常用方法 比如close get  close等等
 */
public class DriverBase {
    public WebDriver driver;
    //构造方法 传入浏览器参数，返回浏览器驱动
    public DriverBase(String browser){
        SelectDriver selectDriver=new SelectDriver();
        this.driver=selectDriver.driverName(browser);
    }
    //driver  的获取url的方法
    public void getUrl(String url){
        this.driver.get(url);
    }
    //driver  的获取close的方法
    public void getClose(){
        this.driver.close();
    }
    //driver  的获取元素的方法
    public WebElement findElement(By by){
        WebElement element=this.driver.findElement(by);
        return element;
    }
    //窗口最大化
    public  void getMaxWindow(){
        this.driver.manage().window().maximize();
    }
    public void switchWindow(){
        WebElement element=driver.findElement(By.cssSelector("#j-ursContainer-1 iframe"));
        driver.switchTo().frame(element);
    }

}
