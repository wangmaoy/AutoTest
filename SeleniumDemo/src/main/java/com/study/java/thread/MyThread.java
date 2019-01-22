package com.study.java.thread;
public class MyThread extends Thread{
    private int  ticket=5;//线程名称
    @Override
    public void run(){
        for(int x=0;x<20;x++){
            if(this.ticket>0){
                System.out.println("卖票，ticket="+this.ticket--);
            }
        }
    }
}
