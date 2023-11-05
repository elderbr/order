package com.elderbr.Order.services;

import com.elderbr.Order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintService {
    @Autowired
    private OrderService orderService;

    public void printOrder(Order order){
        System.out.println(String.format("Pedido código: %d",order.getCode()));
        System.out.println(String.format("Valor total: R$ %.2f", orderService.total(order)));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    }
}
