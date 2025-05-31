package com.springhibernate.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private int amount;
	
	@Column
	private String payment_status;

	public Payment() {
		super();
	}

	public Payment(String payment_status) {
		super();
		this.payment_status = payment_status;
	}

	public Payment(int amount, String payment_status) {
		super();
		this.amount = amount;
		this.payment_status = payment_status;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
}
