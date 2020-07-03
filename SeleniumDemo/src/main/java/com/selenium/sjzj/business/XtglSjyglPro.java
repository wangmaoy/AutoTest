package com.selenium.sjzj.business;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class XtglSjyglPro {
    DriverBase driverBase;
    public XtglSjyglPro(DriverBase driverBase){
        this.driverBase=driverBase;
    }
    /**
     * 添加数据源
     */
    public void addSjy(String sjylx) throws InterruptedException {
        //点击系统管理页签
        driverBase.findElement(GetByLocator.getByLocator("xtgl_tap")).click();
        Thread.sleep(2000);
        //点击数据源页签
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_tap")).click();
        Thread.sleep(1000);
        //新增数据源按钮
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_addsjy")).click();
        Thread.sleep(2000);
        driverBase.switchFrame(driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_switch_frame")));
        Thread.sleep(1000);
        //数据源类型
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_sjylx")).click();
        Thread.sleep(2000);
        //获取下拉框中所有li元素
        List<WebElement> lists=driverBase.findElements(GetByLocator.getByLocator("xtgl_sjygl_sjylx_xlklist"));
        //遍历元素，找到想要选择的数据源
        for(WebElement element:lists){
            String  str=element.findElement(By.tagName("span")).getText();
            if(sjylx.equals(str)){
                //如果数据源类型匹配，则点击对应的数据源
                element.click();
                break;
            }
        }
        //driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_sjylx_xlk")).click();
        //数据源名称
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_sjymc")).sendKeys("sjymc");
        //数据源urL
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_jdbcurl")).clear();
        Thread.sleep(2000);
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_jdbcurl")).sendKeys("jdbc:ArteryBase://172.16.32.221:5432/zhitu");
        //用户名
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_username")).sendKeys("artbase");
        //密码
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_password")).sendKeys("123456");
        //测试连通性
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_csltx")).click();
        //保存
        driverBase.findElement(GetByLocator.getByLocator("xtgl_sjygl_bc")).click();
    }
}
