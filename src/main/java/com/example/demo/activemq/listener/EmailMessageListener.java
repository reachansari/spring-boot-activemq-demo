package com.example.demo.activemq.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.demo.activemq.model.EmailMessage;

@Component
public class EmailMessageListener {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @JmsListener(destination = "email_messages", containerFactory = "jmsListenerContainerFactory")
    public void handleEvent(EmailMessage message) {
        logger.info("Message recieved:: " + message.getTo() + " Thread Id: " + Thread.currentThread().getId());

    }
}
