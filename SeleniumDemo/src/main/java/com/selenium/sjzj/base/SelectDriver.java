package com.selenium.sjzj.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 返回浏览器的driver
 */
public class SelectDriver {
    public static WebDriver getDriver(String browsername){
        if("chrome".equals(browsername)){
            System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            return driver;
        }else{
            System.setProperty("webdriver.chrome.driver","src/main/driver/geckodriver.exe");
            WebDriver driver=new FirefoxDriver();
            return driver;
        }
    }
}
