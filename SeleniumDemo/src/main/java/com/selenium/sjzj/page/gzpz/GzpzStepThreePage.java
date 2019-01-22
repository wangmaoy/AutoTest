package com.selenium.sjzj.page.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.BasePage;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.WebElement;
/**
 * 规则配置第3步界面
 */
public class GzpzStepThreePage extends BasePage{
    public GzpzStepThreePage(DriverBase driverBase){
        super(driverBase);
    }
    /**
     * 获取调度任务元素
     */
    public WebElement getTstepDdrw(){
        return findelement(GetByLocator.getByLocator("tstep_ddrw"));
    }
    /**
     * 获取调度人员弹出框元素
     */
    public WebElement getTstepDdrwSelectBox(){
        return findelement(GetByLocator.getByLocator("tstep_ddrw_select_box"));
    }
    /**
     * 获取完成按钮元素
     */
    public WebElement getTstepFinish(){
        return findelement(GetByLocator.getByLocator("tstep_finish"));
    }
}
