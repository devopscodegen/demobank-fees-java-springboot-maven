package com.demobank.fees.port.adapter.controller.fees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demobank.fees.application.fees.TransactionFeesApplicationService;
import com.demobank.fees.application.fees.CalculateTransactionFeesCommand;
import com.demobank.fees.domain.model.fees.TransactionFees;

@RestController
@RequestMapping("/api/v1/fees")
public class FeesController {
    @Autowired
    private TransactionFeesApplicationService transactionFeesApplicationService;

    @PostMapping("/transaction")
    public TransactionFeesResponse calculateTransactionFees(@RequestBody TransactionFeesRequest request) {
        TransactionFees transactionFees = this.transactionFeesApplicationService.calculateTransactionFees(
            new CalculateTransactionFeesCommand(
                request.getTransactionType(),
                request.getAmount(), 
                request.getCurrency()));
                
        return new TransactionFeesResponse(
            transactionFees.getStatus().toString(), 
            transactionFees.getFees(),
            transactionFees.getFeesCurrency());
    }
}