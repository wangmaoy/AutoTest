package com.interfacedemo.fbajxx.utils;

import com.interfacedemo.fbajxx.model.Ajxx;
import com.interfacedemo.fbajxx.model.Result;
import com.alibaba.fastjson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonAndJavaBeanTool {
    public static Result jsonTransfer(String jsonstr){
        //读取文件中json串
        //String jsonstr=JsonRead();
        //将字符串转换为jsonObject
        JSONObject jsonObjectResult=JSON.parseObject(jsonstr);
        //获取message  count success ajList的值ajList 会都为空，会在下面做处理
        Result result=JSON.parseObject(jsonstr,new TypeReference<Result>(){});
        //获取ajList节点 的所有案件信息 ajxx:xxxx
        JSONArray ajList=jsonObjectResult.getJSONArray("ajList");
        //循环遍历获取的JSONArray {ajxx:{xxxxxx}}
        //System.out.println("ajList中一共包含多少个ajxx:"+ajList.size());
        //list存储所有的案件信息
        List<Ajxx> ajxxes=new ArrayList<Ajxx>();
        for(int i=0;i<ajList.size();i++){
            //获取第i个json对象{ajxx:{xxxxxx}}
            JSONObject jsonObjectAjxx=ajList.getJSONObject(i);
            //将第一个ajxx 转换为字符串
            String s=ajList.getJSONObject(i).getJSONObject("ajxx").toJSONString();
            //将s 和Ajxx 类做转换
            Ajxx ajxx=JSON.parseObject(s,new TypeReference<Ajxx>(){});
            //将第i个ajxx添加到list中
            ajxxes.add(ajxx);
        }
        //给Result 中的List<Ajxx>赋值
        result.setAjList(ajxxes);
        return result;
    }
    public static String JsonRead(){
        File file=new File("E:"+ File.separator+"json.txt");
        InputStream input;
        String str=null;
        if(file.exists()){
            try{
                input=new FileInputStream(file);
                byte data[]=new byte[10240];
                int len=0;
                try{
                    len=input.read(data);
                }catch (IOException e){
                    e.printStackTrace();
                }
                str=new String(data,0,len);
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        return str;
    }
    public static<T> T parseJsonToObj(String json,Class<T> c){
        try{
            JSONObject jsonObject=JSON.parseObject(json);
            return JSON.toJavaObject(jsonObject,c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
