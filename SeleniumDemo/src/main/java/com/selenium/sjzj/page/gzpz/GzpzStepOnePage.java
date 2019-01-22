package com.selenium.sjzj.page.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.BasePage;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.WebElement;
/**
 * 规则配置第1步 界面
 */
public class GzpzStepOnePage extends BasePage{
    public GzpzStepOnePage(DriverBase driverBase){
        super(driverBase);
    }
    /**
     * 元素选择数据源
     */
    public WebElement getFstepSjy(){
        return findelement(GetByLocator.getByLocator("fstep_sjy"));
    }
    /**
     * 选择数据源 弹出的选择框元素
     */
    public WebElement getFstepSjySelectBox(){
        return findelement(GetByLocator.getByLocator("fstep_sjy_select_box"));
    }
    /**
     * 规则名称元素
     */
    public WebElement getFstepGzmc(){
        return findelement(GetByLocator.getByLocator("fstep_gzmc"));
    }
    /**
     * 规则类型元素
     */
    public WebElement getFstepGzlx(){
        return findelement(GetByLocator.getByLocator("fstep_gzlx"));
    }
    /**
     * 规则类型 弹出的选择框
     */
    public WebElement getFstepGzlxSelectBox(){
        return findelement(GetByLocator.getByLocator("fstep_gzlx_select_box"));
    }
    /**
     * 规则说明元素
     */
    public WebElement getFstepGzsm(){
        return findelement(GetByLocator.getByLocator("fstep_gzsm"));
    }
    /**
     * 下一步 元素
     */
    public WebElement getFstepNextButton(){
        return findelement(GetByLocator.getByLocator("fstep_next_button"));
    }
}
