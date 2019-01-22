package com.interfacedemo.fbajxx.dao;

import com.interfacedemo.fbajxx.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class TAjAllDaoTest {
    @Test
    public void findAjById(){
        SqlSession sqlSession=DatabaseUtil.getFbSqlSession();
        TAjAllDao tAjAllDao=sqlSession.getMapper(TAjAllDao.class);
        TAjAll tAjAll=tAjAllDao.findAjById("001ff3b889ebe3a1bbe4fbce143ff01f");
        Assert.assertNotNull("没找到数据",tAjAll);

    }
}
