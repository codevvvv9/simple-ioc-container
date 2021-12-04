package com.github.hcsp.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderDao {
    @Autowired
    private OrderService orderService;

    public void createOrder(User currentLoginUser) {
        System.out.println("User " + currentLoginUser.getName() + " creates an order!");
    }
}
