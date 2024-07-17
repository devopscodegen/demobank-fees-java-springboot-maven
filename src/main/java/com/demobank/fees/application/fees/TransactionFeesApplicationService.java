package com.demobank.fees.application.fees;

import org.springframework.stereotype.Service;

import com.demobank.fees.domain.model.fees.TransactionFees;
import com.demobank.fees.domain.model.transaction.TransactionType;
import com.demobank.fees.domain.model.fees.FeesStatus;

@Service
public class TransactionFeesApplicationService {

    public TransactionFees calculateTransactionFees(CalculateTransactionFeesCommand aCommand) {
        return new TransactionFees(
            TransactionType.valueOf(aCommand.getTransactionType().toUpperCase()), 
            aCommand.getAmount(), 
            aCommand.getCurrency(), 
            FeesStatus.SUCCESS,
            5.0, 
            "USD");
    }
}
