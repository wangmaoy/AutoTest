package com.course;

public class QuestionDemo_4 {
    public static void main(String args[]){
        //冒泡 升序
        //sortAsc();
        //冒泡降序
        //sortDesc();
        //插入排序
        //insertSort();
        int a[]={4,2,7,5,8,10,51,3};
        for(int x:a){
            System.out.print(x+"  ");
        }
        System.out.println("\n");
        quickSort(a,0,a.length-1);
        for(int x:a){
            System.out.print(x+"  ");
        }
    }
    //升序
    public static void sortAsc(){
        int a[]={4,2,7,5,8,10,1,3};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }
    //降序
    public static void sortDesc(){
        int a[]={4,2,7,5,8,10,1,3};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-1;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }
    public static void insertSort(){
        int a[]={4,2,7,5,8,10,1,3};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int x:a){
            System.out.print(x+"  ");
        }
    }
    //快速排序 中轴位置
    public static int getMiddle(int numbers[],int low,int high){
        int middle=numbers[low];
        while(low<high){
            while(low<high&&numbers[high]>middle){
                high--;
            }
            numbers[low]=numbers[high];
            while(low<high&&numbers[low]<middle){
                low++;
            }
            numbers[high]=numbers[low];

        }
        numbers[low]=middle;
        return low;
    }
    //快速排序 递归调用
    public static void quickSort(int numbers[],int low,int high){
        if(low<high){
            int middle=getMiddle(numbers,low,high);
            quickSort(numbers,low,middle-1);
            quickSort(numbers,middle+1,high);
            }
        }
    }

