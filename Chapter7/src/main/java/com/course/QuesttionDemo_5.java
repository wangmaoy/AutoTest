package com.course;

public class QuesttionDemo_5 {
    public static void main(String args[]){
        repeate();

    }
    public static void repeate(){
        int s[]={1,4,5,2,6,7,4,2};
        boolean flag=false;
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j]){
                    flag=true;
                    System.out.println("重复元素"+s[i]);
                    break;
                }
            }
        }
        if(flag){
            System.out.println("无重复元素");
        }else{
            System.out.println("有重复元素");
        }

    }

}
