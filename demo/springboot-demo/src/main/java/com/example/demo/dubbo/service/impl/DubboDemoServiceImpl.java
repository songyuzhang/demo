package com.example.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dubbo.service.DubboDemoService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DubboDemoService.class)
@Component
public class DubboDemoServiceImpl implements DubboDemoService {
    @Override
    public String sendDemo(String demo) {
        System.out.println(demo);
        return demo + ": receive";
    }
}
