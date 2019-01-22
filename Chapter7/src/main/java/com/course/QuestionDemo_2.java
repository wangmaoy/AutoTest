package com.course;
import java.util.Scanner;
public class QuestionDemo_2 {
    public static void main(String  args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please input year:");
        int year=scan.nextInt();
        System.out.println("Please input month");
        int month=scan.nextInt();
        System.out.println("Please input day");
        int day=scan.nextInt();
        System.out.println("是今年的第"+dateToDays(year,month,day)+"天");

    }

    /**
     * 输入日期计算是这年的第几天
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static int dateToDays(int year,int month,int day){
        int totalDays=0;
        switch (month){
            case 12:
                totalDays+=30;
            case 11:
                totalDays+=31;
            case 10:
                totalDays+=30;
            case 9:
                totalDays+=31;
            case 8:
                totalDays+=31;
            case 7:
                totalDays+=30;
            case 6:
                totalDays+=31;
            case 5:
                totalDays+=30;
            case 4:
                totalDays+=31;
            case 3:
                if(((year/4==0)&&(year/100!=0))||(year/400==0)){
                    totalDays+=29;
                }else{
                    totalDays+=28;
                }
            case 2:
                totalDays+=31;
            case 1:
                totalDays+=day;
        }
        return totalDays;

    }

}
