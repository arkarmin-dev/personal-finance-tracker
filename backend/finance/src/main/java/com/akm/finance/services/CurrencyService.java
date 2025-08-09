package com.akm.finance.services;

import com.akm.finance.entities.Currency;

import java.util.List;

public interface CurrencyService {
    Currency addCurrency(Currency currency);
    Currency getCurrencyByCode(String code);
    List<Currency> getAllCurrencies();
}
