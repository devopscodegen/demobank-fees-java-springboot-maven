package com.demobank.fees.port.adapter.controller.fees;

import java.math.BigDecimal;

public class TransactionFeesRequest {

    private String transactionType;
    private BigDecimal amount;
    private String currencyCode;

    public TransactionFeesRequest(String transactionType, BigDecimal amount, String currencyCode) {
        super();

        this.setTransactionType(transactionType);
        this.setAmount(amount);
        this.setCurrencyCode(currencyCode);
    }

    public TransactionFeesRequest() {
        super();
    }

    public String getTransactionType() {
        return transactionType;
    }

    private void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    private void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    private void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}