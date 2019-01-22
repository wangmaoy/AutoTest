package cn.wmy.selenium.util;

import java.io.*;
import java.util.Properties;

/**
 * properties 文件操作
 */
public class ProUtil {
    private Properties prop;
    /**
     * 构造方法
     */
    public ProUtil(String filePath){
        this.prop=readProperties(filePath);
    }
    public  Properties readProperties(String filePath){
        Properties properties=new Properties();
        InputStream inputStream= null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream in=new BufferedInputStream(inputStream);
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
    public String getPro(String key){
        if(prop.containsKey(key)){
            String  value= prop.getProperty(key);
            return value;
        }else{
            System.out.println("你获取的值不对");
            return "";
        }
    }

}
