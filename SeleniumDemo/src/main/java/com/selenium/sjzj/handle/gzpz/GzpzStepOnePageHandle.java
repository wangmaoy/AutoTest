package com.selenium.sjzj.handle.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.gzpz.GzpzStepOnePage;
import org.openqa.selenium.WebElement;

public class GzpzStepOnePageHandle {
    private GzpzStepOnePage gzpzStepOnePage;
    public GzpzStepOnePageHandle(DriverBase driverBase){
        this.gzpzStepOnePage=new GzpzStepOnePage(driverBase);
    }
    /**
     * 找到元素数据源 选择下拉框中弹出的数据源
     */
    public void selectSjy(){
        gzpzStepOnePage.click(gzpzStepOnePage.getFstepSjy());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepOnePage.click(gzpzStepOnePage.getFstepSjySelectBox());
    }
    /**
     * 找到规则名称元素，输入规则名称
     */
    public void gzmcSendkeys(String gzmc){
        gzpzStepOnePage.elementSendKeys(gzpzStepOnePage.getFstepGzmc(),gzmc);
    }
    /**
     * 找到规则类型 选择下拉列表的规则类型
     */
    public void selectGzlx(){
        gzpzStepOnePage.click(gzpzStepOnePage.getFstepGzlx());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepOnePage.click(gzpzStepOnePage.getFstepGzlxSelectBox());
    }

    /**
     * 得到规则说明元素 输入规则说明
     * @param gzsm
     */
    public void gzsmSendkeys(String gzsm){
        gzpzStepOnePage.elementSendKeys(gzpzStepOnePage.getFstepGzsm(),gzsm);
    }
    /**
     * 得到下一步按钮，点击下一步按钮
     */
    public void clickNextButton(){
        gzpzStepOnePage.click(gzpzStepOnePage.getFstepNextButton());
    }
    /**
     * 判断下一步元素是否可点击
     */
    public boolean nextIsClick(){
        if(gzpzStepOnePage.elementEnabled(gzpzStepOnePage.getFstepNextButton())){
            return true;
        }else{return false;}
    }
}
