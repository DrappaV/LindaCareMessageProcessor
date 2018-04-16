package com.lindacare.messageprocessor.validator;

import com.lindacare.messageprocessor.enums.EMarketCountry;
import com.lindacare.messageprocessor.enums.EMarketCurrency;
import com.lindacare.messageprocessor.dao.MarketModel;

public class MarketModelValidator {

    public static  void isValidMarketModel(MarketModel marketModel) throws Exception{
        checkModelNotNull(marketModel);
        checkModelCurrencuy(marketModel);
        checkModelConversion(marketModel);
        checkModelOriginalCountry(marketModel);
    }

    private static void checkModelNotNull(MarketModel marketModel) throws  Exception{
        if(marketModel == null)
            throw new Exception("market model is null");
    }

    private static void checkModelCurrencuy(MarketModel marketModel) throws Exception {
        if(isInvalidCurrency(marketModel.getCurrencyFrom()) ||
           isInvalidCurrency(marketModel.getCurrencyFrom()))
        throw new Exception("Model has bad currency " + marketModel.toString());
    }

    private static void checkModelConversion(MarketModel marketModel) throws Exception {

        if(isInvalidMarketDataFloat(marketModel.getAmountBuy()) ||
           isInvalidMarketDataFloat(marketModel.getAmountSell()) ||
           isInvalidMarketDataFloat(marketModel.getRate()) ||
           hasInvalidConvertion(marketModel))
                throw new Exception("Model has bad amount/rate " + marketModel.toString());
    }

    private static void checkModelOriginalCountry(MarketModel marketModel) throws Exception {
        if(isInvalidCountry(marketModel))
        throw new Exception("Model has bad country " + marketModel.toString());
    }

    private static boolean isInvalidCurrency(String currency)  {
        return !EMarketCurrency.isCurrencyExist(currency);
    }

    private static  boolean isInvalidCountry(MarketModel marketModel) {
        return !EMarketCountry.isCountryExist(marketModel.getOriginatingCountry());
    }

    private static boolean isInvalidMarketDataFloat(Float fl){
        return fl == null || fl < 0;
    }

    private static boolean hasInvalidConvertion(MarketModel marketModel){
        Float amountBuy=marketModel.getAmountBuy();
        Float amountSell=marketModel.getAmountSell();
        Float rate=marketModel.getRate();
        return  amountSell*rate!=amountBuy;
    }

}
