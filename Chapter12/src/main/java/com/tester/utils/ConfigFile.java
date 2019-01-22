package com.tester.utils;
import com.tester.model.InterfaceName;
import java.util.Locale;
import java.util.ResourceBundle;
public class ConfigFile {
    //加载配置文件
    private static ResourceBundle bundle= ResourceBundle.getBundle("application", Locale.CHINA);;
    //传进来的规定是一个枚举类，限制只能传我自己定义的名字
    public static String getUrl(InterfaceName name){
        String address = bundle.getString("test.url");
        //存储从配置文件中获取的uri
        String uri = "";
        //testUrl 最终的地址
        String testUrl;
        if(name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }
        if(name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }
        if(name == InterfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }
        if(name == InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }
        if(name == InterfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }
        testUrl = address + uri;
        return testUrl;
    }
}