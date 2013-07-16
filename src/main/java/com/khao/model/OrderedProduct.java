package com.khao.model;

public class OrderedProduct {
	private int orderId;
	private int productId;
	private int quantity;
	
	public OrderedProduct() {
		super();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int customerId) {
		this.orderId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
