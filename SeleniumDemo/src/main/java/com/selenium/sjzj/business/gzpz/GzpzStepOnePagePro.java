package com.selenium.sjzj.business.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.handle.gzpz.GzpzStepOnePageHandle;

public class GzpzStepOnePagePro {
    private DriverBase driverBase;
    private GzpzStepOnePageHandle gzpzStepOnePageHandle;
    public GzpzStepOnePagePro(DriverBase driverBase){
        this.driverBase=driverBase;
        this.gzpzStepOnePageHandle=new GzpzStepOnePageHandle(driverBase);
    }
    /**
     *规则第一步 表单填写
     */
    public void gzpzStepOneForm(String gzmc,String gzsm){
        //选择数据源
        gzpzStepOnePageHandle.selectSjy();
        //输入规则名称
        gzpzStepOnePageHandle.gzmcSendkeys(gzmc);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //选择规则类型
        gzpzStepOnePageHandle.selectGzlx();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //输入规则说明
        gzpzStepOnePageHandle.gzsmSendkeys(gzsm);
        //判断下一步按钮是否可以点击 如果是就点击跳转到下一步
        if(gzpzStepOnePageHandle.nextIsClick()){
            gzpzStepOnePageHandle.clickNextButton();
        }else{
            System.out.println("下一步按钮无法点击，无法跳转到下一页");
        }
    }

}
