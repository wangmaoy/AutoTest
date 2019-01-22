package com.selenium.sjzj.business;

import com.selenium.sjzj.base.DriverBase;
import com.selenium.sjzj.handle.HomePageHandle;
import com.selenium.sjzj.page.HomePage;

public class HomePagePro {
    private HomePageHandle homePageHandle;
    public HomePagePro(DriverBase driverBase){
        homePageHandle=new HomePageHandle(driverBase);
    }
    /**
     * 点击规则配置页签
     */
    public void clickGzpzTab(){
        homePageHandle.clickGzpzTap();
    }
    /**
     * 获取右上角用户名信息
     */
    public void getUserName(){
        homePageHandle.getHomeUserText();
    }
    /**
     * 根据用户判断用户是否登录
     */
    public Boolean assertLoginUser(String username){
        System.out.println("username"+homePageHandle.getHomeUserText());
        if(homePageHandle.getHomeUserText().equals(username)){
            return true;
        }else{
            return false;
        }
    }
}
