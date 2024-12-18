package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerOrderManagerTest {
    
    @Test
    void testAddCustomer() {
        CustomerOrderManager manager = new CustomerOrderManager();
        manager.addCustomer("John Doe");
        assertTrue(manager.customerList.contains("John Doe"));
    }
    
    @Test
    void testAddOrder() {
        CustomerOrderManager manager = new CustomerOrderManager();
        manager.addOrder("Order1");
        assertTrue(manager.orderList.contains("Order1"));
    }
    
    @Test
    void testProcessOrdersForCustomer() {
        CustomerOrderManager manager = new CustomerOrderManager();
        manager.addCustomer("John Doe");
        manager.addOrder("Order1");
        manager.addOrder("Order2");
        manager.processOrdersForCustomer("John Doe");
        // Verifica que los pedidos se procesaron
        assertEquals(2, manager.orderList.size());
    }

    @Test
    void testGenerateCustomerOrderReport() {
        CustomerOrderManager manager = new CustomerOrderManager();
        manager.addCustomer("John Doe");
        manager.addOrder("Order1");
        manager.generateCustomerOrderReport();
        // Verifica que los informes sean generados correctamente
        assertTrue(manager.customerList.contains("John Doe"));
        assertTrue(manager.orderList.contains("Order1"));
    }
}
