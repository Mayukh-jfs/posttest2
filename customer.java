package com.test3;

import java.util.HashMap;
import java.util.Map;

public class customer {
	static Map customerMap = new HashMap<Integer, order>();
	public static void main(String[] args) 
	{
		order order = new order(222,"Mayukh");
		addCustomer(order);
		findCustomer(100);
		
		order updatedCustomer = new order (666,"Mallhar");
		updateCustomer(updatedCustomer);
		
		deleteCustomer(111);
		
	}
	
	private static void deleteCustomer(int orderId) {
		order order = (order)customerMap.get(orderId);
		if(order != null) {
			customerMap.remove(orderId);
			System.out.println("Customer details Deleted");
			System.out.println(customerMap);
		}
		else {
			System.out.println("Customer details absent");
		}
		
		
	}

	private static void updateCustomer(order order)
	{
		order order2 = (order)customerMap.get(order.orderId);
		if(order2 != null) {
			customerMap.put(order.orderId, order);
			System.out.println("Customers name : " + order);
		}
		else {
			System.out.println("customer name absent");
		}
		
	}

	private static void addCustomer(order order) {
		customerMap.put(order.orderId, order);
	}
	
	
	private static void findCustomer(int orderId) 
	{
		order order = (order)customerMap.get(orderId);
		if(order !=  null)
		{
			System.out.println("Customer present");
		}
		else
		{
			System.out.println("Customer not present");
		}
		
	}

}
