package cn.wmy.selenium.page;

import cn.wmy.selenium.base.DriverBase;
import cn.wmy.selenium.util.GetByLocator;
import org.openqa.selenium.WebElement;
public class HomePage  extends BasePage{
    public HomePage(DriverBase driverBase){
        super(driverBase);
    }
    /**
     * 返回ppt 元素
     */
    public WebElement getPpt(){
        return element(GetByLocator.getLocator(""));

    }
}
