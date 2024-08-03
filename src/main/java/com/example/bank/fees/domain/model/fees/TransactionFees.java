package com.example.bank.fees.domain.model.fees;

import org.jmolecules.ddd.annotation.ValueObject;

import com.example.bank.fees.domain.model.account.transaction.TransactionType;
import com.example.bank.fees.domain.model.money.Money;

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
@ValueObject
public class TransactionFees {
    private TransactionType transactionType;
    private Money amount;
    private FeesStatus feesStatus;
    private Money fees;
}
