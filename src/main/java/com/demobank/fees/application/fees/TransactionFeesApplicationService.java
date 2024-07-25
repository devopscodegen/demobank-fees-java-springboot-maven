package com.demobank.fees.application.fees;

import org.jmolecules.architecture.hexagonal.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.fees.domain.model.fees.TransactionFees;
import com.demobank.fees.domain.model.fees.TransactionFeesService;
import com.demobank.fees.domain.model.money.Money;
import com.demobank.fees.domain.model.account.transaction.TransactionType;
import com.demobank.fees.domain.model.currency.CurrencyCode;

@Service
@Application
public class TransactionFeesApplicationService {

    @Autowired
    private TransactionFeesService transactionFeesService;

    public TransactionFees calculateTransactionFees(CalculateTransactionFeesCommand aCommand) {
        return transactionFeesService.calculateTransactionFees(
            TransactionType.valueOf(aCommand.getTransactionType().toUpperCase()),
            new Money(
                aCommand.getAmount(),
                CurrencyCode.valueOf(aCommand.getCurrency())
            )
        );
    }
}
