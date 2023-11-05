package com.elderbr.Order.services;

import com.elderbr.Order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if(order.getBasic()<100){
            return 20.0;
        }else if(order.getBasic()>=100 && order.getBasic()<=200){
            return 12.00;
        }else{
            return 0;
        }
    }
}
