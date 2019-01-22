package com.study.java.thread;
public class TestRunnableDemo implements Runnable{
    private int ticket=7; //一共6张票
    @Override
    public void run(){
        for(int x=0;x<10;x++) {
            this.sale();
        }
    }
    public synchronized  void sale(){
        if (this.ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "卖票，ticket=" + this.ticket--);
        }
    }

}
