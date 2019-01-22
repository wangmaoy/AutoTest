package com.study.java.thread;

public class Consumer implements Runnable{
    private Message msg=null;
    public Consumer(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            this.msg.get();

        }
    }
}
