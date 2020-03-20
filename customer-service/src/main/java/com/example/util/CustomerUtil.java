package com.example.util;

import java.util.ArrayList;
import java.util.List;

import com.example.vo.Customer;

public class CustomerUtil {
	public static List<Customer> getCustomers() {
		Customer customer1 = new Customer(100, "Ramakanth");
		Customer customer2 = new Customer(200, "Uday");
		Customer customer3 = new Customer(300, "Rajesh");
		Customer customer4 = new Customer(400, "Suresh");
		Customer customer5 = new Customer(500, "Harsha");
		List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		return customers;
	}
	
	

}
