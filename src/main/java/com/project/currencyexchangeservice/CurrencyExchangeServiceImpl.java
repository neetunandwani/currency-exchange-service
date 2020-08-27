package com.project.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {
    @Autowired
    CurrencyExchangeRepository repository;

    public CurrencyExchange find(String from,String to){
        return repository.findByFromAndTo(from,to);
    }
}
