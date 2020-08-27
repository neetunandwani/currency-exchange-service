//package com.project.currencyexchangeservice;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//
//import java.math.BigDecimal;
//
//public class CurrencyExchangeRunner implements CommandLineRunner {
//    @Autowired
//    CurrencyExchangeRepository repository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        CurrencyExchange currencyExchange= new CurrencyExchange("US","INR",new BigDecimal("68"));
//        repository.save(currencyExchange);
//    }
//}
