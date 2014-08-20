package com.linux.kamp;

import java.util.ArrayList;
import java.util.List;

import com.linux.kamp.model.Order;

public class ShoppingCart {

	private static ShoppingCart instance;
	
	private List<Order> orders = new ArrayList<Order>();
	
	private ShoppingCart() {
	}
	
	public static ShoppingCart getInstance() {
		if (instance == null) {
			instance = new ShoppingCart();
		}
		
		return instance;
	}
	
	public double total() {
		//TODO implement this method
		return 0;
	}
	
	public void clear(){
		//TODO empty list
	}
	
	public void add(Order order){
		orders.add(order);
	}
	
	public void show(){
		// TODO create and print a table
	}
}
