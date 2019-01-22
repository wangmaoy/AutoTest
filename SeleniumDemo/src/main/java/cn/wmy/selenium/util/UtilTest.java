package cn.wmy.selenium.util;

import java.io.Reader;
import java.util.Properties;
public class UtilTest {
    public static void main(String agrs[]){

        ProUtil proUtil=new ProUtil("src/main/resources/element.properties");
        String username=proUtil.getPro("username");
        System.out.println(username);
    }
}
