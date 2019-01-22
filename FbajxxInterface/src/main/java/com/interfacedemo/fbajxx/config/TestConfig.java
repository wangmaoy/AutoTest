package com.interfacedemo.fbajxx.config;
import lombok.Data;
import org.apache.http.impl.client.DefaultHttpClient;
@Data
public class TestConfig {
    //非标案件信息接口,这个变量就是application中定义的
    public static String fbajxxUrl;
    //声明客户端
    public static DefaultHttpClient defaultHttpClient;
}
