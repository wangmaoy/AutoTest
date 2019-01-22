package com.course;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class QuestionDemo_1 {
    public static void main(String args[]){
        findmax();

    }
    /**
     * 检索一段话中出现次数最多的英文单词
     */
    public static void findmax(){
        String str ="Look to the skies above London and you’ll see the usual suspects rainclouds, plane and pigeons. But by the end of the year, you might just see something else";
        str=str.replace(","," ");
        str=str.replace("."," ");
        str=str.replaceAll("\\’"," ");
        String strs[]=str.split("\\s+");
        Map<String,Integer> map=new HashMap<String,Integer>();
        List<String> list=new ArrayList<String>();
        for(String s:strs){
            if(map.containsKey(s)){
                int x=map.get(s);
                x++;
                map.put(s,x);
            }else{
                map.put(s,1);
                list.add(s);
            }
        }
        int maxKey=0;
        String maxStr=null;
        for(String s:list){
            if(map.get(s)>maxKey){
                maxKey=map.get(s);
                maxStr=s;
            }
        }
        System.out.println("最高频率单词："+maxStr+"  "+"出现次数："+maxKey);
    }
}
