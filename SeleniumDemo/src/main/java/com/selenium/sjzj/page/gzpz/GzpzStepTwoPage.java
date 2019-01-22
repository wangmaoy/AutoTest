package com.selenium.sjzj.page.gzpz;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.page.BasePage;
import com.selenium.sjzj.util.GetByLocator;
import org.openqa.selenium.WebElement;
/**
 * 规则配置第2步 预定义规则界面
 */
public class GzpzStepTwoPage extends BasePage{
    public GzpzStepTwoPage(DriverBase driverBase){
        super(driverBase);
    }
    /**
     * 获取添加自定义规则按钮
     */
    public WebElement getSstepTjzdygzElement(){
        return findelement(GetByLocator.getByLocator("sstep_tjzdygz"));
    }
    /**
     * 获取数据表文本框元素
     */
    public WebElement getSstepSchemaElement(){
        return findelement(GetByLocator.getByLocator("sstep_schema"));
    }
    /**
     * shema前面的+号
     */
    public WebElement getSstepSchemaSelectBox(){
        return findelement(GetByLocator.getByLocator("sstep_schema_select_box"));
    }
    /**
     * 表名前面的+号
     */
    public WebElement getSstepStable(){
        return findelement(GetByLocator.getByLocator("sstep_stable"));
    }
    /**
     * 选择表
     */
    public WebElement getSstepStatbleBox(){
        return findelement(GetByLocator.getByLocator("sstep_statble_box"));
    }
    /**
     * 字段名称元素
     */
    public WebElement getSstepField(){
        return findelement(GetByLocator.getByLocator("sstep_field"));
    }
    /**
     * 字段名称弹出层
     */
    public WebElement getSstepFieldSelectBox(){
        return findelement(GetByLocator.getByLocator("sstep_field_select_box"));
    }
    /**
     * 校验方法
     */
    public WebElement getSstepJyff(){
        return findelement(GetByLocator.getByLocator("sstep_jyff"));
    }
    /**
     * 校验方法 弹出层元素
     */
    public WebElement getSstepJyffSelectBox(){
        return findelement(GetByLocator.getByLocator("sstep_jyff_select_box"));
    }
    /**
     * 测试验证
     */
    public WebElement getSstepCsyz(){
        return findelement(GetByLocator.getByLocator("sstep_csyz"));
    }
    /**
     * 下一步
     */
    public WebElement getSstepNextbutton(){
        return findelement(GetByLocator.getByLocator("sstep_nextbutton"));
    }

}
