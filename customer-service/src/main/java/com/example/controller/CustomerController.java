package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.CustomerUtil;
import com.example.vo.Customer;

@RestController
public class CustomerController {
	
	@GetMapping
    public List<Customer> getAllCustomers() {
        return CustomerUtil.getCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return CustomerUtil.getCustomers().stream()
                        .filter(customer -> customer.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }

}
