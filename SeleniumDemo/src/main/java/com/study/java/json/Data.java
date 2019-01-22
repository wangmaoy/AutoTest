package com.study.java.json;
public class Data {
    private String ajbs;
    private String ajbh;
    private String ah;
    private String ajmc;

    public String getAjbs() {
        return ajbs;
    }

    public void setAjbs(String ajbs) {
        this.ajbs = ajbs;
    }

    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    @Override
    public String toString() {
        return "Data{" +
                "ajbs='" + ajbs + '\'' +
                ", ajbh='" + ajbh + '\'' +
                ", ah='" + ah + '\'' +
                ", ajmc='" + ajmc + '\'' +
                '}';
    }
}
