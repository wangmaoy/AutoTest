package com.selenium.sjzj.handle.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.gzpz.GzpzStepThreePage;

public class GzpzStepThreePageHandle {
    private GzpzStepThreePage gzpzStepThreePage;
    public GzpzStepThreePageHandle(DriverBase driverBase){
        this.gzpzStepThreePage=new GzpzStepThreePage(driverBase);
    }
    /**
     * 得到调度任务元素，选择调度任务
     */
    public void clickDdrw(){
        gzpzStepThreePage.click(gzpzStepThreePage.getTstepDdrw());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepThreePage.click(gzpzStepThreePage.getTstepDdrwSelectBox());
    }
    /**
     * 获取完成按钮，点击完成按钮
     */
    public void clickFinishButton(){
        gzpzStepThreePage.click(gzpzStepThreePage.getTstepFinish());
    }
}
