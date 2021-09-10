# Spring boot JMS Example
This project depicts the Spring Boot Example with embedded ActiveMQ

## Description
This repository created to explain spring boot + jms + activemq integration easily based on publisher/subscriber pattern. The project contains embedded 
ActiveMQ instance used as a message broker.

The application basically;
* Create 5 instance of *jmsexample.model.EmailMessage* objects
* Convert them to json before sending to queue automatically through jackson by *jmsexample.config.JacksonConfig* 
* Send the json messages to broker
* The messages consume by *jmsexample.listener.EmailMessageListener* 

## Libraries used
- Spring Boot
- Spring Configuration
- Embedded ActiveMQ
- Development Tools

## Junit
- ToDO

## Compilation Command
- `mvn clean install` - Plain maven clean and install

