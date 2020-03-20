/*
 * @Author : Ramakanth D
 * 
 * */
package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.OrderUtil;
import com.example.vo.Order;


@RestController
public class OrderController {
	
	@GetMapping
    public List<Order> getAllCustomers() {
        return OrderUtil.getOrders();
    }
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return OrderUtil.getOrders().stream()
                        .filter(order -> order.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
    @GetMapping("/order/{customerId}")
    public List<Order> getOrderByCustomerId(@PathVariable int customerId) {
        return OrderUtil.getOrderByCustomerId(customerId);
    }

}
