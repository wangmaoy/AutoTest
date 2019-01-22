package com.study.java.json;
import com.alibaba.fastjson.*;

import java.io.*;
import java.util.List;

public class JsonDemo {
    /**
     * 读取文件中的json内容，以返回字符串返回
     * @return
     */
    public static String JsonRead() {
        File file=new File("E:"+ File.separator+"json.txt");
        InputStream input;
        String str=null;
        if(file.exists()) try {
            input = new FileInputStream(file);
            byte data[]= new byte[2048];
            int len= 0;
            try {
                len = input.read(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
            str=new String(data,0,len);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 获取遍历json中的数据
     * @param str
     */
    public static void JsonParing(String str){
       JSONObject jsonObject=JSON.parseObject(str);
       JSONArray jsonArray=jsonObject.getJSONArray("data");
       int size=jsonArray.size();
       for(int i=0;i<size;i++){
           JSONObject dataJsonObject=jsonArray.getJSONObject(i);
           System.out.println("data节点下的第"+(i+1)+"个案件"+dataJsonObject);

       }
    }

    /**
     * json字符串-数组类型与javaBean之间的转换
     */
    public static void jsonTansfer(String str){
       Result result= JSON.parseObject(str,new TypeReference<Result>(){});
        String code=result.getCode();
        System.out.println(code+"----");
        List<Data> list = result.getData() ;
        for(Data d:list){
            System.out.println(d);
            System.out.println(d.getAjbs());
        }
    }
    public static void main(String arts[]){
        String str=JsonDemo.JsonRead();
        //JsonDemo.JsonParing(str);
        JsonDemo.jsonTansfer(str);
    }
}
