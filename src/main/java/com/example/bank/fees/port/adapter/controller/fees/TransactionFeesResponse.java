package com.example.bank.fees.port.adapter.controller.fees;

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
public class TransactionFeesResponse {
    private String status;
    private BigDecimal fees;
    private String feesCurrencyCode;
}