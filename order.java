package com.test3;

public class order {
	public int orderId;
	public String orderName;
	public int orderQuantity;
	public order (int OrderId , String orderName)
	{
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderQuantity = orderQuantity;
	}
	@Override
	public void confirm()
	{
		System.out.println("Your order shall be delivered shortly.");
	}
	@Override
	public void close()
	{
		System.out.println("Your Order shall becancelled");
	}
	@Override
	public void dispatch()
	{
		System.out.println("Your order shall be dispatched");
	}
	@Override
	public void confirm1() 
	{
		System.out.println("Item confirmed");
	}
	@Override
	public void close1() {
		System.out.println("Order closed");
	}
	@Override
	public void dispatch1() {
		System.out.println("Dispatched order");
	}
	@Override
	public void receive1() {
		System.out.println("Delivered order");
	}
	
}

