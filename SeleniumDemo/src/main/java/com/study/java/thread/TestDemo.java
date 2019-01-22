package com.study.java.thread;

public class TestDemo {
    public static void main(String[] args) {
        /**
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();
        MyThread mt3=new MyThread();
        mt1.start();
        mt2.start();
        mt3.start();

        TestRunnableDemo trd1=new TestRunnableDemo();
        new Thread(trd1,"票贩子A" ).start();
        new Thread(trd1,"票贩子B" ).start();
        new Thread(trd1,"票贩子C" ).start();
        new Thread(trd1,"票贩子D" ).start();
        new Thread(trd1,"票贩子E" ).start();
         **/
        Message msg=new Message();
        Producer pro=new Producer(msg);
        new Thread(pro).start();
        Consumer cons=new Consumer(msg);
        new Thread(cons).start();
    }
}
