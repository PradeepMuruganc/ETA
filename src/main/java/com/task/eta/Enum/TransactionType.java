package com.task.eta.Enum;

public enum TransactionType {

        INCOME("Income"),EXPENSE("Expense");

        String transactionType;

        TransactionType(String transactionType) {
            this.transactionType = transactionType;
        }


    }

