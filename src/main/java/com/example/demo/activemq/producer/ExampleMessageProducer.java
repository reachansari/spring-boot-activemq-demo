package com.example.demo.activemq.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.activemq.model.EmailMessage;

@Component
public class ExampleMessageProducer implements CommandLineRunner {
	 private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void run(String... args) throws Exception {
        for(int i = 1; i <= 5; i++) {
        	logger.info("Message is going to be sent");
            jmsTemplate.convertAndSend("email_messages", new EmailMessage("Hi:"+i+"@gmail.com", "Hi:"+i));
        }
    }
}
