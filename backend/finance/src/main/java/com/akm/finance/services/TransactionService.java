package com.akm.finance.services;

import com.akm.finance.entities.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction addTransaction(Transaction transaction);
    List<Transaction> getTransactionsByUserId(Long userId);
}
