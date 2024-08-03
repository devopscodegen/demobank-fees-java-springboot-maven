package com.example.bank.fees.application.fees;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CalculateTransactionFeesCommand {

    private String transactionType;
    private BigDecimal amount;
    private String currency;
}
