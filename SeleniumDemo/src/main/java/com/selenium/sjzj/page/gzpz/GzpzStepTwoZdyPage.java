package com.selenium.sjzj.page.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.BasePage;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.WebElement;

/**
 * 规则配置第2步 自定义规则界面
 */
public class GzpzStepTwoZdyPage extends BasePage{
    public GzpzStepTwoZdyPage(DriverBase driverBase){
        super(driverBase);
    }
    /**
     * 添加自定义规则元素
     */
    public WebElement getSstepTjzdygzElement(){
        return findelement(GetByLocator.getByLocator("sstep_tjzdygz"));
    }
    /**
     * 质检对象元素
     */
    public WebElement getZjdx(){
        return findelement(GetByLocator.getByLocator("sstep_zdy_zjdx"));
    }
    /**
     * 规则SQL元素
     */
    public WebElement getGzsql(){
        return findelement(GetByLocator.getByLocator("sstep_zdy_gzsql"));
    }
    /**
     * 测试验证按钮
     */
    public WebElement getCsyz(){
        return findelement(GetByLocator.getByLocator("sstep_zdy_csyz"));
    }
    /**
     * 弹出框确认按钮
     */
    public WebElement getConfimButton(){
        return findelement(GetByLocator.getByLocator("sstep_zdy_confim_button"));
    }
    /**
     * 下一步按钮
     */
    public WebElement getNextbutton(){
        return findelement(GetByLocator.getByLocator("sstep_zdy_nextbutton"));
    }
}
