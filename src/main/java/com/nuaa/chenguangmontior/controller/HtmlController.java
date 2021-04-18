package com.nuaa.chenguangmontior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gethtml")
public class HtmlController {
    @RequestMapping("/getMonitor")
    public String getHtml(){
        return  "monitor";
    }

}
