package com.khao.model;

import java.sql.Timestamp;

public class CustomerOrder {
	private int id;
	private double amount;
	private Timestamp date_created;
	private int confirmationNumber;
	private int customerId;
	
	
	
	public CustomerOrder() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public Timestamp getDate_created() {
		return date_created;
	}



	public void setDate_created(Timestamp date_created) {
		this.date_created = date_created;
	}



	public int getConfirmationNumber() {
		return confirmationNumber;
	}



	public void setConfirmationNumber(int confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
