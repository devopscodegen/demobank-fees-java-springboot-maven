package com.demobank.fees.domain.model.fees;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.demobank.fees.domain.model.money.Money;
import com.demobank.fees.domain.model.account.transaction.TransactionType;

@Service
@org.jmolecules.ddd.annotation.Service
public class TransactionFeesService {

    public TransactionFees calculateTransactionFees(TransactionType transactionType, Money amount) {
        Money fees = new Money(            
            new BigDecimal(5.0),
            amount.getCurrencyCode()
        );
        return new TransactionFees(
            transactionType, 
            amount,
            FeesStatus.SUCCESS,
            fees);
    }
}
