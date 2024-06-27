package com.monocept.srp.solution;

public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
    	System.out.println("Id : "+invoice.getId()+" "+"\nItem : "+invoice.getDescription());
        System.out.println("cost : " + invoice.getAmount());
        System.out.println("GST : " + invoice.getTax());
        System.out.println("Total amount : " + (invoice.getTax() + invoice.getAmount()));
    }
}
