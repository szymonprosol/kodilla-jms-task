package com.kodilla.kodillajmstask.receiver;

import com.kodilla.kodillajmstask.order.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "queue-test")
    public void receive(Order order) {
        System.out.println("Received the order: " +
                order.getOrderNumber() + "\n" +
                order.getCustomerNumber() + "\n" +
                order.getProductName() + "\n" +
                order.getPrice());
    }
}