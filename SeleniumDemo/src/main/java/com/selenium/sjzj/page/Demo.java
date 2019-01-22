package com.selenium.sjzj.page;

import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {
    @Test
    public void sjzj(){
        //登录界面
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tap.thunisoft.com/ssoserver/login?service=http://172.16.176.216:19999/sjzj/cas");
        WebElement username1=driver.findElement(By.id("username1"));

        username1.sendKeys("dengzhigang");
        WebElement password1=driver.findElement(By.id("password1"));
        password1.sendKeys("123");
        WebElement dl_cz=driver.findElement(By.className("dl_cz"));
        dl_cz.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //点击规则配置页签，进入规则配置界面
        WebElement gzpz=driver.findElement(By.cssSelector("div.fd-left-con > div.fd-left-con-bg >ul>li:nth-child(2) > span"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpz.click();
        //点击新建规则
        WebElement createButton=driver.findElement(By.cssSelector("div.fd-center > div:nth-child(2) > div.fd-right > button:nth-child(1) > span"));
        createButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击数据源输入框 弹出选择框
        WebElement sjy=driver.findElement(By.cssSelector("div.aty-select-selection > input.aty-select-input"));
        sjy.click();
        //选择具体的数据源 GP库
        WebElement bzksjy=driver.findElement(By.cssSelector("div.aty-select-dropdown > ul.aty-select-dropdown-list > li:nth-child(1) > span"));
        bzksjy.click();
        //输入规则名称
        WebElement gzmz=driver.findElement(By.cssSelector("div.aty-input-box > input"));
        //生成规则名称
        String str="规则名称"+Math.random()*10;
        gzmz.sendKeys(str);
        //输入规则类型
        WebElement gzlx=driver.findElement(By.cssSelector("div.aty-form-item-content > div > div.aty-select-selection > span.aty-select-placeholder"));
        WebElement gzlxSelect=driver.findElement(By.cssSelector("div.aty-select-dropdown > ul.aty-select-dropdown-list > li:nth-child(1) > span"));
        gzlxSelect.click();
        //点击规则说明 触发下一步按钮
        WebElement gzsm=driver.findElement(By.cssSelector("div.aty-textarea-wrapper"));
        gzsm.click();
        //点击下一步
        WebElement nextbutton=driver.findElement(By.cssSelector("div.fd-btn-kj > button:nth-child(2) > span"));
        nextbutton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击添加自定义规则
        WebElement zdygzbutton=driver.findElement(By.cssSelector("div.aty-tabs-nav > div:nth-child(2) > div:nth-child(2)"));
        zdygzbutton.click();
        //输入质检对象
        WebElement zjdx=driver.findElement(By.cssSelector("div.fd-jj > form >div:nth-child(1) > div > div > textarea"));
        zjdx.sendKeys("Select n_ajzlb from db_spyw.t_aj");
        //输入质检SQL
        WebElement zjsql=driver.findElement(By.cssSelector("div.fd-jj > form >div:nth-child(2) > div > div > textarea"));
        zjsql.sendKeys("n_ajzlb is null" );
        //点击测试验证
        WebElement csyz=driver.findElement(By.cssSelector("div.fd-form-yz > button > span"));
        csyz.click();
        WebElement nextbutton2=driver.findElement(By.cssSelector("div.fd-btn-kj > button:nth-child(2) > span"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nextbutton2.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //第3个界面 选择调度任务
        WebElement ddrw=driver.findElement(By.cssSelector("div.aty-select-selection > span.aty-select-placeholder"));
        ddrw.click();
        WebElement ddrwselect=driver.findElement(By.cssSelector("div.aty-select-dropdown > ul.aty-select-dropdown-list > li:nth-child(1) > span"));
        ddrwselect.click(); //和一部分选择数据源用的是相同的元素
        //点击完成
        //WebElement finish=driver.findElement(By.cssSelector("span[textContent='完成']"));
        WebElement finish=driver.findElement(By.xpath("//span[text()='完成']"));
        finish.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }
}
