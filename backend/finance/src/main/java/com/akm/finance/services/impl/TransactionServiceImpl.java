package com.akm.finance.services.impl;

import com.akm.finance.entities.Transaction;
import com.akm.finance.repositories.TransactionRepository;
import com.akm.finance.services.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getTransactionsByUserId(Long userId) {
        return transactionRepository.findAll()
                .stream()
                .filter(t -> t.getUser().getId().equals(userId))
                .toList();
    }
}
