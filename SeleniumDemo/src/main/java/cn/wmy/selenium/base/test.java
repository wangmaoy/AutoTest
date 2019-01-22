package cn.wmy.selenium.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {
    public static void main(String args[]){
        //验证浏览器是否能打开
        SelectDriver selectDriver=new SelectDriver();
        WebDriver driver=selectDriver.driverName("chrome");
        driver.get("http://www.baidu.com");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("kw"));
        element.sendKeys("你好");
    }
}
