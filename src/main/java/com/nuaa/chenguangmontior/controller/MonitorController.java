package com.nuaa.chenguangmontior.controller;


import com.nuaa.chenguangmontior.model.ProgramKnife;
import org.springframework.beans.factory.annotation.Autowired;
import com.nuaa.chenguangmontior.service.MonitorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MonitorController {
    @Autowired
     MonitorService  monitorService;
    @GetMapping("/test")
    public List<ProgramKnife> tset(){
       // System.out.println(monitorService.findByid(1));
        return monitorService.findByProgram("order70");

    }

}
