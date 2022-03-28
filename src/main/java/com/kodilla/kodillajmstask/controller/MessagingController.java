package com.kodilla.kodillajmstask.controller;

import com.kodilla.kodillajmstask.order.Order;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessagingController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/process")
    public void processMessage(@RequestBody Order order) {
        jmsTemplate.convertAndSend("queue-test", order);
    }

}