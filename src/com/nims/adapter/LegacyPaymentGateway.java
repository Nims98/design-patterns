package com.nims.adapter;

public class LegacyPaymentGateway implements LegacyPayment{
    private final String amount;

    public LegacyPaymentGateway(String amount) {
        this.amount = amount;
    }

    @Override
    public void paymentInit() {
        System.out.println("Initiate payment");
    }

    @Override
    public String paymentAmount() {
        return amount;
    }
}
