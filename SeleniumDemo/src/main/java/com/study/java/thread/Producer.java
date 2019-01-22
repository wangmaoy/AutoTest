package com.study.java.thread;

public class Producer  implements Runnable{
    private  Message msg=null;
    public Producer(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            if(i% 2==0){
                this.msg.set("wangmaoy","employee");
            }else {
                this.msg.set("huayu","www.thunisoft.com");
            }
        }
    }
}
