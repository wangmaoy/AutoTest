package com.selenium.sjzj.business.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.handle.gzpz.GzpzStepTwoPageHandle;

/**
 * 规则配置第2步  预定义规则
 */
public class GzpzStepTwoYdyPagePro {
    private GzpzStepTwoPageHandle gzpzStepTwoPageHandle;
    public GzpzStepTwoYdyPagePro(DriverBase driverBase){
        this.gzpzStepTwoPageHandle=new GzpzStepTwoPageHandle(driverBase);
    }
    public void gzpzStepTwoYdyForm(){
        //选择数据表
        gzpzStepTwoPageHandle.clicksjb();
        //选择字段名称
        gzpzStepTwoPageHandle.clickField();
        //选择检验方法
        gzpzStepTwoPageHandle.clickJyff();
        //测试验证
        gzpzStepTwoPageHandle.clickCsyz();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //下一步
        if(gzpzStepTwoPageHandle.isNextClick()){
            gzpzStepTwoPageHandle.clickNextButton();
        }else{
            System.out.println("下一步按钮无法点击，请检查规则是否校验通过");
        }

    }

}
