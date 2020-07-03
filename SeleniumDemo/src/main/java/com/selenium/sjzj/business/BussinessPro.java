package com.selenium.sjzj.business;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.handle.HomePageHandle;
import com.selenium.sjzj.handle.LoginHandle;
import com.selenium.sjzj.handle.gzpz.*;
import com.selenium.sjzj.page.HomePage;
import com.selenium.sjzj.page.gzpz.GzpzStepOnePage;

public class BussinessPro {
    private LoginHandle lh;
    private HomePageHandle hph;
    private GzpzHomePageHandle gzpzHomePageHandle;
    private GzpzStepOnePageHandle gzpzStepOnePageHandle;
    private GzpzStepTwoPageHandle gzpzStepTwoPageHandle;
    private GzpzStepThreePageHandle gzpzStepThreePageHandle;
    private GzpzStepTwoZdyPageHandle gzpzStepTwoZdyPageHandle;
    public BussinessPro(DriverBase driverBase){
        this.lh=new LoginHandle(driverBase);
        this.hph=new HomePageHandle(driverBase);
        this.gzpzHomePageHandle=new GzpzHomePageHandle(driverBase);
        this.gzpzStepOnePageHandle=new GzpzStepOnePageHandle(driverBase);
        this.gzpzStepTwoPageHandle=new GzpzStepTwoPageHandle(driverBase);
        this.gzpzStepThreePageHandle=new GzpzStepThreePageHandle(driverBase);
        this.gzpzStepTwoZdyPageHandle=new GzpzStepTwoZdyPageHandle(driverBase);
    }
    //登录 --到点击新建规则
    public void login(String username,String password){
        //登录界面登录
        lh.sendKeysUser(username);
        lh.sendKeysPassword(password);
        lh.clickLoginButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击规则配置标签，进入规则配置界面
        hph.clickGzpzTap();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //点击新建规则
        gzpzHomePageHandle.clickNewGzButton();
    }
    //新建规则第一步
    public void fstepPro(String gzmc,String gzsm){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        gzpzStepOnePageHandle.selectSjy();
        gzpzStepOnePageHandle.gzmcSendkeys(gzmc);
        //这必须得加等待时间，要不就通不过
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepOnePageHandle.selectGzlx();
        gzpzStepOnePageHandle.gzsmSendkeys(gzsm);
        gzpzStepOnePageHandle.clickNextButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //新建规则第2步
    public void sstepPro(){
        gzpzStepTwoPageHandle.clicksjb();
        gzpzStepTwoPageHandle.clickField();
        gzpzStepTwoPageHandle.clickJyff();
        gzpzStepTwoPageHandle.clickCsyz();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepTwoPageHandle.clickNextButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 新建规则第3步
     */
    public void tstepPro(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //选择调度任务
        gzpzStepThreePageHandle.clickDdrw();
        //点击完成
        gzpzStepThreePageHandle.clickFinishButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * 新建规则第二步 自定义规则
     */
    public void zdygz(String gzmc,String zjdx,String gzsql){
        gzpzStepTwoZdyPageHandle.clickTjzdygzButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //String zjdx="select c_id from db_test.t_gxjh";
        //String gzsql="n_jafs is null";
        gzpzStepTwoZdyPageHandle.sendKeysZjdx(zjdx);
        gzpzStepTwoZdyPageHandle.sendKeysGzsql(gzsql);
        gzpzStepTwoZdyPageHandle.cilckCsyz();

        gzpzStepTwoZdyPageHandle.clickConfirmButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gzpzStepTwoZdyPageHandle.clickNextbutton();
    }
}
