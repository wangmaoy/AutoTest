package com.interfacedemo.fbajxx.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TAjAllDao {
    public void insert(TAjAll tAjAll);
    public TAjAll findAjById(String ajbh);
    public List<TAjAll> findAllAj();
}
