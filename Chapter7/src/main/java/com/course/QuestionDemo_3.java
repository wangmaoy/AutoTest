package com.course;

public class QuestionDemo_3 {
    /**
     * 字符串反转
     * @param args
     */
    public static void main(String args[]){
        String str="abcdefg";
        char[] c=str.toCharArray();

        int i=0;
        int j=c.length-1;
        while(i<=j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        String str1=new String(c);
        System.out.println("反转后的字符串:"+str1);
    }
}
