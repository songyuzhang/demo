package com.example.demo.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class QueueConfig {
    @Bean
    public Queue queue() {
        return new Queue("demo");
    }

    @Bean
    public DirectExchange directExchange() {
        DirectExchange directExchange = new DirectExchange("exchangeDemo", true, false);
        return directExchange;
    }

    @Bean
    public Binding bindingDemo() {
        return BindingBuilder.bind(queue()).to(directExchange()).with("queue_one_key");

    }


}
