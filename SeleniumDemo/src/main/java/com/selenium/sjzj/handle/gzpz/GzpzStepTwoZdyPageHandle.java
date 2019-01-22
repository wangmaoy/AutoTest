package com.selenium.sjzj.handle.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.gzpz.GzpzStepTwoZdyPage;

public class GzpzStepTwoZdyPageHandle {
    private GzpzStepTwoZdyPage gzpzStepTwoZdyPage;
    public GzpzStepTwoZdyPageHandle(DriverBase driverBase){
        this.gzpzStepTwoZdyPage=new GzpzStepTwoZdyPage(driverBase);
    }
    /**
     * 获取自定义规则元素，点击添加自定义规则按钮
     */
    public void clickTjzdygzButton(){
        gzpzStepTwoZdyPage.click(gzpzStepTwoZdyPage.getSstepTjzdygzElement());
    }
    /**
     * 获取质检对象元素，输入质检对象值
     */
    public void sendKeysZjdx(String zjdx){
        gzpzStepTwoZdyPage.elementSendKeys(gzpzStepTwoZdyPage.getZjdx(),zjdx);
    }
    /**
     * 获取规则SQL对象元素，输入规则SQL
     */
    public void sendKeysGzsql(String gzsql){
        gzpzStepTwoZdyPage.elementSendKeys(gzpzStepTwoZdyPage.getGzsql(),gzsql);
    }
    /**
     * 获取测试验证元素，点击测试验证
     */
    public void cilckCsyz(){
        gzpzStepTwoZdyPage.click(gzpzStepTwoZdyPage.getCsyz());
    }
    /**
     * 获取下一步元素，点击下一步
     */
    public void clickNextbutton(){
        gzpzStepTwoZdyPage.click(gzpzStepTwoZdyPage.getNextbutton());
    }
    /**
     * 下一步按钮可否点击
     */
    public boolean isNextClick(){
        if(gzpzStepTwoZdyPage.elementEnabled(gzpzStepTwoZdyPage.getNextbutton())){
            return true;
        }else{
            return false;
        }
    }

}
