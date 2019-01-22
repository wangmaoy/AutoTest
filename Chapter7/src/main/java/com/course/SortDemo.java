package com.course;

public class SortDemo {
    /**
     * 两个有序数组合并
     * @param a
     * @param b
     * @return
     */
    public  static  int[] merge (int a[],int b[]){
        int i=0;
        int j=0;
        int k=0;
        int [] result=new int[a.length+b.length];
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                result[k]=a[i];
                i++;
                k++;
            }else{
                result[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            result[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            result[k]=b[j];
            j++;
            k++;
        }
        return result;

    }

    /**
     * 一个数字查找一个数字的起始 和 结束位置
     * @param
     */
    public static void index(int a[],int key){
        int firstIndex=firstIndex(a,key);
        System.out.println("key出现的第一个位置"+firstIndex);
        int  lastIndex=lastIndex(a,key);
        System.out.println("key出现的第二个位置"+lastIndex);

    }
    public static int  firstIndex(int a[],int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i+1;
            }
        }
        return 0;
    }
    public static int lastIndex(int a[],int key){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]==key){
                return i+1;
            }
        }
        return 0;
    }

    public static void printDemo(int r[]) {
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+"    ");
        }

    }

    public static void main(String args[]){
        int a[]={2,5,9,12,20};
        int b[]={3,4,10,25,35,37};
        printDemo(merge(a,b));
        int c[]={3,5,7,8,3,5,6,5};
        index(c,5);
    }
}
