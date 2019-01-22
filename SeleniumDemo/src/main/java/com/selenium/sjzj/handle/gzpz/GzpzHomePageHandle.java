package com.selenium.sjzj.handle.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.gzpz.GzpzHomePage;

public class GzpzHomePageHandle {
    GzpzHomePage gzpzHomePage;
    public GzpzHomePageHandle(DriverBase driverBase){
        this.gzpzHomePage=new GzpzHomePage(driverBase);
    }
    /**
     * 找到新建规则按钮，然后点击新建规则
     */
    public void clickNewGzButton(){
        gzpzHomePage.click(gzpzHomePage.getNewGzButton());
    }
}
