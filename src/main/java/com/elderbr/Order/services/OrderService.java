package com.elderbr.Order.services;

import com.elderbr.Order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double descount = (order.getBasic() * (order.getDiscount()/100));
        double total = order.getBasic() - descount;
        order.setBasic(total);
        return order.getBasic() + shippingService.shipment(order);
    }
}
