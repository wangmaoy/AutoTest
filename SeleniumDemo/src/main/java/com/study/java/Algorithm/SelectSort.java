package com.study.java.Algorithm;

public class SelectSort {
    /**
     * 选择排序
     * @param a
     * @return
     */
    public int[] selectSort(int a[]){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<a.length;i++){
            //从（j,n]中找到
            int minindex=i;
            for(int j=i;j<a.length;j++){
                if(a[j]<a[minindex]){
                    minindex=j;
                }
            }
            swap(a,i,minindex);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("选择排序运行时间："+(endTime-startTime));
        return a;

    }
    /**
     * 插入排序O() 交换通过赋值来取代
     */
    public int[] insertSort(int a[]){
        long startTime=System.currentTimeMillis();
        for(int i=1;i<a.length;i++){
            int tmp=a[i];
            int j;//保存tmp 应该插入的位置
            for(j=i;j>0&&(tmp<a[j-1]);j--){
                    a[j]=a[j-1];
            }
            a[j]=tmp;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("插入排序运行时间："+(endTime-startTime));
        return a;
    }
    public int[] insertSortSlow(int a[]){
        long startTime=System.currentTimeMillis();
        for(int i=1;i<a.length;i++){
            for(int j=i;j>0&&(a[j]<a[j-1]);j--){
                    swap(a,j,j-1);
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("慢插入排序运行时间："+(endTime-startTime));
        return a;
    }

    public void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
