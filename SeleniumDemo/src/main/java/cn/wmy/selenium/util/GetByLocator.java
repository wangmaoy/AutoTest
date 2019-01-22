package cn.wmy.selenium.util;

import org.openqa.selenium.By;
public class GetByLocator {
    public static By getLocator(String key){
        ProUtil properties=new ProUtil("src/main/resources/element.properties");
        String str=properties.getPro(key);
        String locatorType=str.split("~")[0];
        String locatorValue=str.split("~")[1];
        if("id".equals(locatorType)){
            return By.id(locatorValue);
        }else if("className".equals(locatorType)){
            return By.className(locatorValue);
        }else if ("name".equals(locatorType)){
            return By.name(locatorValue);
        }else if("cssSelector".equals(locatorType)){
            return By.cssSelector(locatorValue);
        }else if("xpath".equals(locatorType)){
            return By.xpath(locatorValue);
        }else if("linkText".equals(locatorType)){
            return By.linkText(locatorValue);
        }else if("tagName".equals(locatorType)){
            return By.tagName(locatorValue);
        }else{
            return null;
        }
    }
}
