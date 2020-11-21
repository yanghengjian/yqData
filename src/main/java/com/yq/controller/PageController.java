package com.yq.controller;

import com.yq.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class PageController {

    @Autowired(required=true)
    private PageService pageService;

    @RequestMapping("/hello")
    public String hello(){
            return "index";
    }

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
       return "index";
    }


}
