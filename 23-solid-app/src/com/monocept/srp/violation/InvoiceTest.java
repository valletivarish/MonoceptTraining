package com.monocept.srp.violation;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice1=new Invoice(10,"shoes",6999);
		invoice1.calculateTax();
		invoice1.printInvoice();
		Invoice invoice2=new Invoice(11,"Suit",5999);
		invoice2.calculateTax();
		invoice2.printInvoice();
		
		

	}

}
