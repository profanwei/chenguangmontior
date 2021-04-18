package com.nuaa.chenguangmontior.service;

import com.nuaa.chenguangmontior.dao.MenuDao;
import com.nuaa.chenguangmontior.model.LoadAllMenuBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menudao;
    @Override
    public List<LoadAllMenuBean> LoadFirstLevel() {

        return menudao.selectAllMenu();
    }

    @Override
    public List<LoadAllMenuBean> LoadSecondLevel(String pid) {
        return menudao.selectChildrenMenu(pid);
    }
}
