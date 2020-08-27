package com.project.currencyexchangeservice;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class CurrencyExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "from_currency")
    private String from;

    @Column(name = "to_currency")
    private String to;

    @Column
    private BigDecimal conversionRate;

    private transient String port;

    public CurrencyExchange() {
    }

    public CurrencyExchange(String from, String to, BigDecimal conversionRate) {
        this.from = from;
        this.to = to;
        this.conversionRate = conversionRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
