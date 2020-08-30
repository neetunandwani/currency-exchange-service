package com.project.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

@RestController
public class CurrencyExchangeController {

    Logger logger = Logger.getLogger(CurrencyExchangeController.class.getName());

    @Autowired
    private CurrencyExchangeService service;

    @Autowired
    Environment environment;

    @GetMapping("/currency/rate/from/{from}/to/{to}")
    public CurrencyExchange getRate(@PathVariable("from")String from, @PathVariable("to") String to){
        logger.info("check sleuth exchange service");
        CurrencyExchange currencyExchange= service.find(from,to);
        currencyExchange.setPort(environment.getProperty("local.server.port"));
        return currencyExchange;
    }

}
