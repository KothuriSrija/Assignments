package com.rabbit.customer.controller;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.customer.config.MessageConfig;
import com.rabbit.customer.model.Customer;

@RestController
@RequestMapping("/customer")
public class PublishController {
	
	 @Autowired
	    private RabbitTemplate template;

	    @PostMapping("/")
	    public String bookcustomer(@RequestBody Customer customer) {
	        customer.setCostumerId("6");
	        System.out.println(customer);
	        template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, customer);
	        return "Success !!";
	    }
	    @GetMapping("/get")
	    public Customer getc(){
	        Customer c = new Customer();
	        c.setCostumerId(UUID.randomUUID().toString());
	        c.setAge(20);
	        c.setName("Tae");
	        c.setMobile_number("94914");
	        return  c ;
	    }
}
