package com.study.java.thread;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertData {
    public static final String DBDERVER="org.postgresql.Driver";
    public static final String DBURL="jdbc:postgresql://172.16.32.221:5432/db_test11111";
    public static final String DBUSER="artbase";
    public static final String DBPASSWORD="123456";
    public static void main(String[] args) throws Exception{
        Connection conn=null;
        PreparedStatement pstmt=null;
        Class.forName(DBDERVER);
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
        String sql="Insert into db_sjl.t_sj(id,c_sj) values(?,?)";
        pstmt=conn.prepareStatement(sql);
        int id=2;
        String str=JsonRead();
        pstmt.setInt(1,id);
        pstmt.setString(2,str);
        int len=pstmt.executeUpdate();
        System.out.println("更新行数："+len);
        pstmt.close();
        conn.close();
    }
    public static String JsonRead() {
        File file=new File("E:"+ File.separator+"bigdata.txt");
        InputStream input;
        String str=null;
        if(file.exists()) try {
            input = new FileInputStream(file);
            byte data[]= new byte[10240];
            int len= 0;
            try {
                len = input.read(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
            str=new String(data,0,len);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str;
    }
}
