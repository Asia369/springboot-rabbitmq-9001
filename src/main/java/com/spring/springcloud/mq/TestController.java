package com.spring.springcloud.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private Sender sender;
	
	@GetMapping("/testSend")
	public String testSend() {
		sender.send();
		System.out.println("消息已经发送......");
		return "success";
	}
}
