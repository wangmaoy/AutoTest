package com.interfacedemo.fbajxx.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

import static org.apache.ibatis.io.Resources.*;

public class DatabaseUtil {
    public static SqlSession getSqlSession(){
        //获取配置的资源文件
        Reader reader=null;
        try {
            reader= getResourceAsReader("databaseConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //得到SqlSessionFactory使用类加载器加载xml文件
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
        //得到sqlsession对象，这个对象就能执行配置文件中的sql语句了
        SqlSession session=factory.openSession();
        return session;
    }
    public static SqlSession getFbSqlSession(){
        //获取配置的资源文件
        Reader reader=null;
        try {
            reader= getResourceAsReader("postgrelConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //得到SqlSessionFactory使用类加载器加载xml文件
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
        //得到sqlsession对象，这个对象就能执行配置文件中的sql语句了
        SqlSession session=factory.openSession();
        return session;
    }

}
