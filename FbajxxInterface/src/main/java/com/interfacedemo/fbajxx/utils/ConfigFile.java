package com.interfacedemo.fbajxx.utils;

import com.interfacedemo.fbajxx.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    //加载配置文件
    private static ResourceBundle bundle=ResourceBundle.getBundle("application", Locale.CHINA);
    //传进来一的是规定的一个枚举类，限制只能传我自己定义的名字
    public static String getUrl(InterfaceName name){
        String address=bundle.getString("test.url");
        //从配置文件中获取uri
        String uri="";
        //testurl拼接后最终的地址
        String testUrl;
        if(name==InterfaceName.FBAJXX){
            uri=bundle.getString("fbajxx.uri");
        }
        testUrl=address+uri;
        return testUrl;
    }
}
