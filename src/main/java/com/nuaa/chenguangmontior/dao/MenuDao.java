package com.nuaa.chenguangmontior.dao;

import com.nuaa.chenguangmontior.model.LoadAllMenuBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MenuDao {
    List<LoadAllMenuBean> selectAllMenu();
    List<LoadAllMenuBean> selectChildrenMenu(String pid);
}
