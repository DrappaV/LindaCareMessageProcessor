package com.lindacare.messageprocessor.enums;

import java.util.Arrays;

public enum EMarketCountry {
    FRANCE("FR"),
    BELGIUM("BE"),
    US("US"),
    AUSTRALIA("AUS"),
    CANADA("CAN"),
    INDIAN("IND"),
    ITALY("IT")
    ;

    private String country;

    EMarketCountry(String name){
        this.country = name;
    }

    public static boolean isCountryExist(String countryToFind){
        return Arrays.stream(EMarketCountry.values())
                .filter(c -> c.country.equalsIgnoreCase(countryToFind))
                .count() == 1;
    }
}
