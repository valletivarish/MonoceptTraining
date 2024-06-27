package com.monocept.srp.solution;

import com.monocept.srp.solution.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice(1, "shoes", 6999);
        TaxCalculator taxCalculator1 = new TaxCalculator(invoice1);
        InvoicePrinter invoicePrinter1 = new InvoicePrinter(invoice1);
        taxCalculator1.calculateTax();
        invoicePrinter1.printInvoice();

//		Invoice invoice2=new Invoice(11,"Suit",5999);
//		invoice2.calculateTax();
//		invoice2.printInvoice();
    }
}
