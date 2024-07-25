package com.demobank.fees.domain.model.account.transaction;

import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
public enum TransactionType {

    DEBIT {
        public boolean isDebit() {
            return true;
        }
    },

    CREDIT {
        public boolean isCredit() {
            return true;
        }
    };

    public boolean isDebit() {
        return false;
    }

    public boolean isCredit() {
        return false;
    }

    public TransactionType regress() {
        if (this.isDebit()) {
            return DEBIT;
        } else if (this.isCredit()) {
            return CREDIT;
        }

        return DEBIT;
    }
}
