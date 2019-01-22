package com.selenium.sjzj.util;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

public class GetByLocator {
    /**
     * 传入定位元素的方式 id name or cssSelector 然后元素的属性名称
     *
     * @return
     */
    public static By getByLocator(String key) {
        ProUtil proUtil = new ProUtil("src/main/resources/sjzj.properties");
        String value = proUtil.getPro(key);
        String str[] = value.split("~");
        if (str.length == 2) {
            String type = str[0];
            String name = str[1];
            if ("id".equals(type)) {
                return By.id(name);
            } else if ("cssSelector".equals(type)) {
                return By.cssSelector(name);
            } else if (name.equals(type)) {
                return By.name(name);
            } else if ("className".equals(type)) {
                return By.className(name);
            } else if("xpath".equals(type)){
                return By.xpath(name);
            }else{
                return null;
            }
        } else {
            System.out.println("元素的定位类型和内容不对，请检查sjzj.properties!!!");
            return null;
        }
    }
}
