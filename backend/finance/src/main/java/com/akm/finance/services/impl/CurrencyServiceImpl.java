package com.akm.finance.services.impl;

import com.akm.finance.entities.Currency;
import com.akm.finance.repositories.CurrencyRepository;
import com.akm.finance.services.CurrencyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    private final CurrencyRepository currencyRepository;

    public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @Override
    public Currency addCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }

    @Override
    public Currency getCurrencyByCode(String code) {
        return currencyRepository.findByCode(code).orElseThrow(() -> new RuntimeException("Currency not found"));
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }
}
