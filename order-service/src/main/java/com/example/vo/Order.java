package com.example.vo;

public class Order {
	
	private int id;
	private int customerId;
	private String name;
	public Order(int id, int customerId, String name) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
