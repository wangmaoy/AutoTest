package com.selenium.sjzj.handle.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.gzpz.GzpzStepTwoPage;

public class GzpzStepTwoPageHandle {
    private GzpzStepTwoPage gzpzStepTwoPage;
    public GzpzStepTwoPageHandle(DriverBase driverBase){
        this.gzpzStepTwoPage=new GzpzStepTwoPage(driverBase);
    }
    /**
     * 得到数据表元素，点击数据表
     */
    public void clicksjb(){
        //点击数据数据表 弹出下拉框
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepSchemaElement());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击schema前面的+号
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepSchemaSelectBox());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击表前面的+号
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepStable());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击具体的表名
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepStatbleBox());
    }
    /**
     * 得到字段名称元素，点击字段
     */
    public void clickField(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepField());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepFieldSelectBox());

    }
    /**
     * 得到校验方法元素，点击校验方法
     */
    public void clickJyff(){
        //点击校验方法
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepJyff());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //选中下拉列表中的某一方法
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepJyffSelectBox());
    }
    /**
     * 找到测试验证，点击测试验证按钮
     */
    public void clickCsyz(){
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepCsyz());
    }
    /**
     * 找到下一步按钮，点击下一步
     */
    public void clickNextButton(){
        gzpzStepTwoPage.click(gzpzStepTwoPage.getSstepNextbutton());
    }
    /**
     * 下一步按钮可否点击
     */
    public boolean isNextClick(){
        if(gzpzStepTwoPage.elementEnabled(gzpzStepTwoPage.getSstepNextbutton())){
            return true;
        }else{
            return false;
        }
    }
}
