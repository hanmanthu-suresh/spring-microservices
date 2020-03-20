/*
 * @Author : Ramakanth D
 * 
 * */
package com.example.util;

import java.util.ArrayList;
import java.util.List;


import com.example.vo.Order;


public class OrderUtil {
	public static List<Order> getOrders() {
		Order order1 = new Order(11, 100,"Laptop");
		Order order2 = new Order(22, 300, "keyboard");
		Order order3 = new Order(33, 100, "Mouse");
		Order order4 = new Order(44, 400, "Monitor");
		Order order5 = new Order(55, 200, "Head Phones");
		List<Order> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		return orders;
	}
	public static List<Order> getOrderByCustomerId(int customerId) {
		List<Order> ordersList = new ArrayList<>();
		List<Order> orders = getOrders();
		for (Order order : orders) {
			if(order.getCustomerId() == customerId) {
				ordersList.add(order);
			}
		}
		return ordersList;
      
    }
	
	

}
