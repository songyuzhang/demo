package com.example.demo.rabbitmq.service.impl;

import com.example.demo.rabbitmq.service.RabbitmqService;
import com.example.demo.vo.DemoVO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rabbitmqService")
public class RabbitmqServiceImpl implements RabbitmqService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public String sendDemo(DemoVO demoVO) {
        rabbitTemplate.convertAndSend(demoVO);
        return "success";
    }
}
