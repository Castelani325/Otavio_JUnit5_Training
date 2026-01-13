package br.com.otavio.Service;

import br.com.otavio.Model.PaymentProcessor;

import java.math.BigDecimal;

public class CheckoutService {


    //Codigo importado da aula
    public BigDecimal purchaseProduct(String productName, String customerId) {

        // Any arbitrary implementation
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        return paymentProcessor.chargeCustomer(customerId, BigDecimal.TEN);
    }
}
