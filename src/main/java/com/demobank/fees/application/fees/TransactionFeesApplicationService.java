package com.demobank.fees.application.fees;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.demobank.fees.domain.model.fees.TransactionFees;
import com.demobank.fees.domain.model.money.Money;
import com.demobank.fees.domain.model.account.transaction.TransactionType;
import com.demobank.fees.domain.model.currency.CurrencyCode;
import com.demobank.fees.domain.model.fees.FeesStatus;

@Service
public class TransactionFeesApplicationService {

    public TransactionFees calculateTransactionFees(CalculateTransactionFeesCommand aCommand) {
        Money amount = new Money(
            aCommand.getAmount(),
            CurrencyCode.valueOf(aCommand.getCurrency())
        );
        Money fees = new Money(            
            new BigDecimal(5.0),
            CurrencyCode.valueOf(aCommand.getCurrency())
        );
        return new TransactionFees(
            TransactionType.valueOf(aCommand.getTransactionType().toUpperCase()), 
            amount,
            FeesStatus.SUCCESS,
            fees);
    }
}
