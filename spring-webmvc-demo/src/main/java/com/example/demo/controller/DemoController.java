package com.example.demo.controller;

import com.example.demo.dubbo.service.DubboDemoService;
import com.example.demo.rabbitmq.service.RabbitmqService;
import com.example.demo.vo.DemoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author songyuzhang
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired
    private DubboDemoService dubboDemoService;

    @Autowired
    private RabbitmqService rabbitmqService;

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {

        System.out.println("in.................");
        String result = dubboDemoService.sendDemo("1233");

        DemoVO demoVO = new DemoVO();
        demoVO.setKey("KEY"+System.currentTimeMillis());
        demoVO.setValue("VALUE"+System.currentTimeMillis());
        String rabbitResult = rabbitmqService.sendDemo(demoVO);
        System.out.println(result);
        System.out.println(rabbitResult);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
