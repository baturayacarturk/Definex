package com.patika.garantiservice.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQProducer {

    private final RabbitTemplate rabbitTemplate;


    public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;

    }
    public void sendMessage(Object request,String routingKey) {
        rabbitTemplate.convertAndSend(routingKey, request);
    }

}
