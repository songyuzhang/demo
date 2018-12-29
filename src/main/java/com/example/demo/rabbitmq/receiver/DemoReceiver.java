package com.example.demo.rabbitmq.receiver;

import com.example.demo.vo.DemoVO;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "demo")
public class DemoReceiver {

    @RabbitHandler
    public void process(DemoVO demo) {
        System.out.println("Receiver1  : " + demo.toString());
    }
}
