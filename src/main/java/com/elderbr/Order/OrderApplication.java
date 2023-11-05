package com.elderbr.Order;

import com.elderbr.Order.entities.Order;
import com.elderbr.Order.services.OrderService;
import com.elderbr.Order.services.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private PrintService printService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		printService.printOrder(order);

		order = new Order(2282, 800.00, 10);
		printService.printOrder(order);

		order = new Order(1309, 95.90, 0);
		printService.printOrder(order);
	}
}
