package com.demobank.fees.domain.model.fees;

import com.demobank.fees.domain.model.transaction.TransactionType;

public class TransactionFees {
    private TransactionType transactionType;
    private Double amount;
    private String currency;
    private FeesStatus feesStatus;
    private double fees;
    private String feesCurrency;

    public TransactionFees(TransactionType transactionType, Double amount, String currency, FeesStatus feesStatus, double fees, String feesCurrency) {
        super();

        this.setTransactionType(transactionType);
        this.setAmount(amount);
        this.setCurrency(currency);
        this.setStatus(feesStatus);
        this.setFees(fees);
        this.setFeesCurrency(feesCurrency);
    }

    public TransactionFees() {
        super();
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public FeesStatus getStatus() {
        return feesStatus;
    }

    public void setStatus(FeesStatus feesStatus) {
        this.feesStatus = feesStatus;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getFeesCurrency() {
        return feesCurrency;
    }

    public void setFeesCurrency(String feesCurrency) {
        this.feesCurrency = feesCurrency;
    }
}
