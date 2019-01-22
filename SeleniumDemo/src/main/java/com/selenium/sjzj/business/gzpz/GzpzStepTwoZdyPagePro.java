package com.selenium.sjzj.business.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.handle.gzpz.GzpzStepTwoZdyPageHandle;

/**
 * 规则配置 第2步 自定义规则
 */
public class GzpzStepTwoZdyPagePro {
    private DriverBase driverBase;
    private GzpzStepTwoZdyPageHandle gzpzStepTwoZdyPageHandle;
    public GzpzStepTwoZdyPagePro(DriverBase driverBase){
        this.driverBase=driverBase;
        this.gzpzStepTwoZdyPageHandle=new GzpzStepTwoZdyPageHandle(driverBase);
    }
    public void gzpzStepTwoZdyForm(String zjdx,String gzsql){
        //点击添加自定义规则按钮
        gzpzStepTwoZdyPageHandle.clickTjzdygzButton();
        //输入质检对象
        gzpzStepTwoZdyPageHandle.sendKeysZjdx(zjdx);
        //输入规则sql
        gzpzStepTwoZdyPageHandle.sendKeysGzsql(gzsql);
        //停1s 再点击测试验证

        //点击测试验证 后停留几秒 等待校验
        gzpzStepTwoZdyPageHandle.cilckCsyz();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //如果下一步可以点击则 测试验证通过，否则规则有问题校验不通过
        if(gzpzStepTwoZdyPageHandle.isNextClick()){
            gzpzStepTwoZdyPageHandle.clickNextbutton();
        }else{
            System.out.println("下一步按钮无法点击，请检查规则是否校验通过");
        }
    }
}
