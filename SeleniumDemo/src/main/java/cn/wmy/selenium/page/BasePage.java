package cn.wmy.selenium.page;

import cn.wmy.selenium.base.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
/**
 * 基类 父类，封装一些element的常用公用方法 比如click ，sendkeys主要是其他页面对象可以继承 直接使用
 */
public class BasePage {
    private  DriverBase  driverbase;
    /**
     * 构造方法 参数driverbase
     * @param driverbase
     */
    public BasePage(DriverBase  driverbase){
        this.driverbase=driverbase;
    }
    /**
     * 封装获取元素的方法
     */
    public WebElement element(By by ){
        WebElement  element=driverbase.findElement(by);
        if(element!=null){
            return  element;
        }else{
            System.out.println("元素没有定位到");
            return null;
        }

    }
    /**
     * 封装给元素输入值 ,参数 元素对象 要输入的值，封装元素的sendKeys(String key) 方法
     * @param element
     * @param value
     */
    public void sendKey(WebElement element, String value){
        if(element!=null){
            element.sendKeys(value);
        }else{
            System.out.println("此"+element+"元素没有定位到,输入失败"+value);
        }
    }

    /**
     * 封装点击元素
     * @param element
     */
    public void click(WebElement element){
        if(element!=null){
            element.click();
        }else{
            System.out.println("此"+element+"元素没有定位到");
        }

    }
    /**
     *判断元素是否显示
     */
    public boolean isElementDisplay(WebElement element){
        return element.isDisplayed();
    }

}
