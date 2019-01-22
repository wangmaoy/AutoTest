package com.study.java.Algorithm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    //返回数组，包含n 个整数
    public static int[] randomNumber(int n){
        int[] random=new int[n];
        for(int i=0;i<n;i++){
            random[i]=(int)(Math.random()*n);
        }
        return random;
    }
    public static void main(String args[]){
        int[] beforesort=randomNumber(10000);
        int[] copyarr=beforesort.clone();
        int[] copyarr2=beforesort.clone();
        /***
        System.out.println("-------排序前数组--------");
        for(int i=0;i<beforesort.length;i++){
            System.out.print("  "+beforesort[i]);
        }
        System.out.println();
        for (int a:copyarr) {
            System.out.print(" "+a);
        }
        ***/
        SelectSort s=new SelectSort();
        //int[]aftersort=s.selectSort(beforesort);
        //选择排序
        s.selectSort(beforesort);
        //插入排序
        s.insertSort(copyarr);
        //慢插入排序
        s.insertSortSlow(copyarr2);
        /***
        System.out.println("\n-------排序后数组--------");
        for(int i=0;i<copyarr.length;i++){
            System.out.print("  "+copyarr[i]);
        }
         ***/

    }
}
