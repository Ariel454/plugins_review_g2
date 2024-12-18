package com.example;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrderManager { // Renombrada para mayor claridad
    public List<String> customerList = new ArrayList<>(); // Renombrada para mayor claridad
    public List<String> orderList = new ArrayList<>(); // Renombrada para mayor claridad
    
    // Adds a customer to the list
    public void addCustomer(String customerName) { // Renombrado para mayor claridad
        customerList.add(customerName);
        System.out.println("Added customer: " + customerName);
    }
    
    // Adds an order to the list
    public void addOrder(String orderDescription) { // Renombrado para mayor claridad
        orderList.add(orderDescription);
        System.out.println("Order added: " + orderDescription);
    }
    
    // Processes all orders for a specific customer
    public void processOrdersForCustomer(String customerName) { // Renombrado para mayor claridad
        System.out.println("Processing orders for: " + customerName);
        for (String order : orderList) {
            System.out.println("Processing order: " + order);
        }
    }
    
    // Generates a summary report for customers and orders
    public void generateCustomerOrderReport() { // Renombrado para mayor claridad
        System.out.println("Customer Report");
        for (String customer : customerList) {
            System.out.println("Customer: " + customer);
        }
        System.out.println("Order Report");
        for (String order : orderList) {
            System.out.println("Order: " + order);
        }
    }
    
    public static void main(String[] args) {
        CustomerOrderManager manager = new CustomerOrderManager(); // Renombrado para mayor claridad
        manager.addCustomer("John Doe");
        manager.addCustomer("Jane Smith");
        manager.addOrder("Order1");
        manager.addOrder("Order2");
        manager.processOrdersForCustomer("John Doe");
        manager.generateCustomerOrderReport();
    }
}
