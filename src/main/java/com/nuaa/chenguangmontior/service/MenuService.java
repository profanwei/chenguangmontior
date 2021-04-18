package com.nuaa.chenguangmontior.service;

import com.nuaa.chenguangmontior.model.LoadAllMenuBean;

import java.util.List;

public interface MenuService {
    List<LoadAllMenuBean> LoadFirstLevel();
    List<LoadAllMenuBean> LoadSecondLevel(String pid);
}
