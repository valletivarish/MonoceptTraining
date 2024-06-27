package com.monocept.srp.violation;

public class Invoice {
	private int id;
	private String description;
	private double amount;
	private double tax;
	public void calculateTax() {
		tax=amount*0.1;
	}
	public void printInvoice() {
		System.out.println(description+" cost : "+amount);
		System.out.println("GST : "+tax);
		System.out.println("Total amount : "+(tax+amount));
	}
	public Invoice() {
		super();
	}
	public Invoice(int id, String description, double amount) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}

}
