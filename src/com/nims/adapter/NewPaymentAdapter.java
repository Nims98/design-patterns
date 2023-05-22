package com.nims.adapter;

public class NewPaymentAdapter implements NewPaymentGateway{

    private final LegacyPayment legacyPayment;

    public NewPaymentAdapter(LegacyPayment legacyPayment) {
        this.legacyPayment = legacyPayment;
    }

    @Override
    public void pay() {
        legacyPayment.paymentInit();
    }

    @Override
    public String getAmount() {
        return legacyPayment.paymentAmount();
    }
}
