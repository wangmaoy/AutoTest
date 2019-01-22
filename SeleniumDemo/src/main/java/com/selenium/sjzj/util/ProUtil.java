package com.selenium.sjzj.util;

import java.io.*;
import java.util.Properties;

public class ProUtil {
    Properties pro;
    private String filepath;
    public ProUtil(String filepath){
        this.filepath=filepath;
        this.pro=readProperties(filepath);
    }
    //解析properties文件
    public Properties readProperties(String file){
        Properties properties=new Properties();
        InputStream in= null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //properties文件有中文的时候会出现乱码，把这里改成gbk就可以了
        try {
            properties.load(new InputStreamReader(in,"gbk"));  //加载属性列表
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
    /**
     * 获取元素属性的方法
     */
    public String getPro(String name){
        if(pro.containsKey(name)){
            String value=pro.getProperty(name);
            return value;
        }else{
            System.out.println("属性文件key 对应的value为空，请检查sjzj.properties！！！");
            return "";
        }
    }
    /**
     * 写入内容
     */
    public void writePro(String key,String value){
        Properties pro=new Properties();
        try {
            FileOutputStream file=new FileOutputStream(filepath);
            pro.setProperty(key,value);
            pro.store(file,key);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
