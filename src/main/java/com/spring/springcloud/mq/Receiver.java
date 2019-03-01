package com.spring.springcloud.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Receiver {
 
	private Integer count=new Integer(0);
	
    @RabbitHandler
    public void process(String hello){
    	count=count+1;
        System.out.println("Receiver:" + hello+" "+count);
    }
}