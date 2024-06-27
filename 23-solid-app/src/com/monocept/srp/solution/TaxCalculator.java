package com.monocept.srp.solution;

public class TaxCalculator {
    private Invoice invoice;

    public TaxCalculator(Invoice invoice) {
        this.invoice = invoice;
    }

    public void calculateTax() {
        invoice.setTax(invoice.getAmount() * 0.1);
    }
}
