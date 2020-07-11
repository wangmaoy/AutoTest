package com.selenium.sjzj.util;

import com.selenium.sjzj.base.DriverBase;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class HandleCookieUtil {
    private DriverBase driverBase;
    private ProUtil proUtil;
    public HandleCookieUtil(DriverBase driverBase){
        this.driverBase=driverBase;
        this.proUtil=new ProUtil("src/main/resources/cookie.properties");
    }
    /**
     * 设置cookie
     */
    public void setCookie(){
        String value=proUtil.getPro("JSESSIONID");
        Cookie cookie=new Cookie("JSESSIONID",value,"[IP]","/sjzj",null);

        driverBase.setCookie(cookie);
    }
    /**
     * 将cookie 写入cookie.properties
     */
    public void writeCookie(){
        Set<Cookie> cookies=this.driverBase.getCookie();
        for (Cookie  cookie:cookies) {
            if(cookie.getName().equals("JSESSIONID")){
                proUtil.writePro(cookie.getName(),cookie.getValue());
            }
        }
    }

}
