package com.demobank.fees.application.fees;

import java.math.BigDecimal;

public class CalculateTransactionFeesCommand {

    private String transactionType;
    private BigDecimal amount;
    private String currency;

    public CalculateTransactionFeesCommand(String transactionType, BigDecimal amount, String currency) {
        super();

        this.setTransactionType(transactionType);
        this.setAmount(amount);
        this.setCurrency(currency);
    }

    public CalculateTransactionFeesCommand() {
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

    public String getCurrency() {
        return currency;
    }

    private void setCurrency(String currency) {
        this.currency = currency;
    }
}
