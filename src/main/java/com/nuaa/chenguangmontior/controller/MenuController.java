package com.nuaa.chenguangmontior.controller;

import com.nuaa.chenguangmontior.model.LoadAllMenuBean;
import com.nuaa.chenguangmontior.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;
    @GetMapping("/load")
    public List<LoadAllMenuBean> loadmenu(){
        ArrayList<LoadAllMenuBean> list = new ArrayList<LoadAllMenuBean>();
        List<LoadAllMenuBean> parent= menuService.LoadFirstLevel();
        for(int i=0;i<parent.size();i++){
            LoadAllMenuBean tree=parent.get(i);
            String pid=tree.getId();
            List<LoadAllMenuBean> children=menuService.LoadSecondLevel(pid);
            tree.setChildren(children);
            list.add(tree);
        }
        return list;
    }
}
