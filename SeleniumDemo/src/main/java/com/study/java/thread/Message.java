package com.study.java.thread;

public class Message {
    private String title;
    private String content;
    private boolean flag=true; //true 可以生产 不能取走
    public synchronized  void set(String title,String content){
        if(flag==false){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.title=title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content=content;
        this.flag=false;
        super.notify();
    }
    public synchronized  void get(){
        if(flag==true){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            super.notify();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title+"----------"+this.content);
        this.flag=true;
        super.notify();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
