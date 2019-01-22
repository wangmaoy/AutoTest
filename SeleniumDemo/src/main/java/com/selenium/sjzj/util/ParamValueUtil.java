package com.selenium.sjzj.util;

public class ParamValueUtil {
    /**
     * 规则名称生成
     */
    public static String gzmc(){
        return "规则名称"+Math.random()*10;
    }
    /**
     * 规则说明
     */
    public static String gzsm(){
        return "规则说明"+Math.random()*10;
    }
}
