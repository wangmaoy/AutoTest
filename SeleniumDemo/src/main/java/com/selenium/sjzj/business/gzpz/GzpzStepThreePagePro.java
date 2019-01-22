package com.selenium.sjzj.business.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.handle.gzpz.GzpzStepThreePageHandle;

/**
 * 规则配置第3步
 */
public class GzpzStepThreePagePro {
    private DriverBase driverBase;
    private GzpzStepThreePageHandle gzpzStepThreePageHandle;
    public GzpzStepThreePagePro(DriverBase driverBase){
        this.driverBase=driverBase;
        this.gzpzStepThreePageHandle=new GzpzStepThreePageHandle(driverBase);
    }
    public void gzpzStepThreeForm(){
        //选择调度任务
        gzpzStepThreePageHandle.clickDdrw();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击完成按钮
        gzpzStepThreePageHandle.clickFinishButton();
    }
}
