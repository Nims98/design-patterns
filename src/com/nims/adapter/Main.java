package com.nims.adapter;

public class Main {
    public static void main(String[] args) {
        LegacyPayment paymentGateway = new LegacyPaymentGateway("1000");
        NewPaymentAdapter newPaymentAdapter = new NewPaymentAdapter(paymentGateway);

        newPaymentAdapter.pay();
        System.out.println("payment amount : " + newPaymentAdapter.getAmount());

    }
}
