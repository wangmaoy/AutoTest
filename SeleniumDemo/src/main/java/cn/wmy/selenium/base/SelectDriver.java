package cn.wmy.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    /**
     * 选择用哪个浏览器驱动,返回驱动名字 参数浏览器名字
     */
    public WebDriver driverName(String browser){
        if(browser.equals("chrome")){
            //设置驱动
            System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
            //返回一个对应的浏览器对象
            return new ChromeDriver();
        }else{
            System.setProperty("webdriver.gecko.driver","src/main/driver/geckodriver.ext");
            return new FirefoxDriver();
        }
    }
}
