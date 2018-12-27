package com.example.demo.rabbitmq;

import com.example.demo.rabbitmq.sender.DemoSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSenderTest {

    @Autowired
    private DemoSender sender; //sender

    @Test
    public void testSend(){
        sender.send();
    }

}
