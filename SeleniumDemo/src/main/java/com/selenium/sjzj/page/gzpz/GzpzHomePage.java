package com.selenium.sjzj.page.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.BasePage;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.WebElement;

public class GzpzHomePage extends BasePage{
    public GzpzHomePage(DriverBase driverBase){
        super(driverBase);
    }
    /**
     * 新建规则元素
     */
    public WebElement getNewGzButton(){
        return findelement(GetByLocator.getByLocator("gzpz_new"));
    }
}
