package com.kodilla.kodillajmstask.order;

import java.io.Serializable;

public class Order implements Serializable {

    private int orderNumber;
    private int customerNumber;
    private String productName;
    private double price;

    public Order(int orderNumber, int customerNumber, String productName, double price) {
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
        this.productName = productName;
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
