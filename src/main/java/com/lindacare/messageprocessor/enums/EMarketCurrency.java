package com.lindacare.messageprocessor.enums;

import java.util.Arrays;

public enum EMarketCurrency {
    EUROPE("EUR"),
    BRITAIN("GBP"),
    US("USD"),
    AUSTRALIA("AUD"),
    CANADA("CAD"),
    INDIAN("INR")
    ;

    private String currency;

    EMarketCurrency(String name){
        this.currency = name;
    }

    public static boolean isCurrencyExist(String currencyToFind){
        return Arrays.stream(EMarketCurrency.values())
                .filter(c -> c.currency.equalsIgnoreCase(currencyToFind))
                .count() == 1;
    }
}
