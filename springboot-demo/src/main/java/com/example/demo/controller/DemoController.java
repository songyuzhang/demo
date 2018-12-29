package com.example.demo.controller;

import com.example.demo.dubbo.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController {

    /*@Autowired
    private DubboDemoService dubboDemoService;*/

    @RequestMapping("/index")
    public String index() {

        //dubboDemoService.sendDemo("");
        return "index";
    }


}
