package com.example.demo.rabbitmq.sender;

import com.example.demo.vo.DemoVO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoSender implements RabbitTemplate.ConfirmCallback {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        DemoVO demo = new DemoVO();
        demo.setKey(String.valueOf(System.currentTimeMillis()));
        demo.setValue("TEST");
        amqpTemplate.convertAndSend("demo", demo);

    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        System.out.println(s);
    }
}
