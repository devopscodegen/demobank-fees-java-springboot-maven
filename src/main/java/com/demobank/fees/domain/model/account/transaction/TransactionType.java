package com.demobank.fees.domain.model.account.transaction;

import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public enum TransactionType {

    WITHDRAW {
        public boolean isWithdraw() {
            return true;
        }
    },

    DEPOSIT {
        public boolean isDeposit() {
            return true;
        }
    };

    public boolean isWithdraw() {
        return false;
    }

    public boolean isDeposit() {
        return false;
    }

    public TransactionType regress() {
        if (this.isWithdraw()) {
            return WITHDRAW;
        } else if (this.isDeposit()) {
            return DEPOSIT;
        }

        return WITHDRAW;
    }
}
