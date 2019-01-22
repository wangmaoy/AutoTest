package com.selenium.sjzj.testcase.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.business.gzpz.GzpzStepOnePagePro;
import com.selenium.sjzj.business.gzpz.GzpzStepThreePagePro;
import com.selenium.sjzj.business.gzpz.GzpzStepTwoZdyPagePro;
import com.selenium.sjzj.handle.gzpz.GzpzStepTwoZdyPageHandle;
import com.selenium.sjzj.util.HandleCookieUtil;
import com.selenium.sjzj.util.ParamValueUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 自定义规则流程测试
 */
public class SuiteTestGzpzZdy {
    public DriverBase driverBase;
    public GzpzStepOnePagePro gzpzStepOnePagePro;
    public GzpzStepTwoZdyPagePro gzpzStepTwoZdyPagePro;
    public GzpzStepThreePagePro gzpzStepThreePagePro;
    public HandleCookieUtil handleCookieUtil;
    @BeforeClass
    public void beforeClass(){
        this.driverBase=new DriverBase("chrome");
        this.gzpzStepOnePagePro=new GzpzStepOnePagePro(driverBase);
        this.gzpzStepTwoZdyPagePro=new GzpzStepTwoZdyPagePro(driverBase);
        this.gzpzStepThreePagePro=new GzpzStepThreePagePro(driverBase);
        this.handleCookieUtil=new HandleCookieUtil(driverBase);
        //自定义规则配置-新建规则-第一步界面
        this.driverBase.getUrl("http://172.16.176.216:19999/sjzj/gzpz/newRuleStep01");
        handleCookieUtil.setCookie();
        this.driverBase.getUrl("http://172.16.176.216:19999/sjzj/gzpz/newRuleStep01");
        this.driverBase.getMaxWindow();
    }
    @Test
    public void testZydgzProcess(){
        //规则配置第一步 表单内容填写
        //生成规则名称
        String gzmc= ParamValueUtil.gzmc();
        //生成规则说明
        String gzsm=ParamValueUtil.gzsm();
        gzpzStepOnePagePro.gzpzStepOneForm(gzmc,gzsm);
        //规则配置第2步 表单内容填写
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String zjdx="Select n_ajzlb from db_spyw.t_aj";
        String gzsql="n_ajzlb is null";
        gzpzStepTwoZdyPagePro.gzpzStepTwoZdyForm(zjdx,gzsql);

        //规则配置第3步 选择调度任务
        gzpzStepThreePagePro.gzpzStepThreeForm();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterClass
    public void afterClass(){
        this.driverBase.quit();
    }
}
