package com.lindacare.messageprocessor.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lindacare.messageprocessor.dao.MarketModel;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class MarketModelConverter {

    private static ObjectMapper mapper = new ObjectMapper();
    static {
        mapper.setDateFormat(new SimpleDateFormat("dd-MMM-yy HH:mm:ss", Locale.US));
    }


    public static MarketModel json2MarketModel(String marketModelJson) throws IOException {
        try{
            return mapJson2MarketModel(marketModelJson);
        }
        catch (IOException e) {
            throw e;
        }
    }

    private static  MarketModel mapJson2MarketModel(String marketModelJson) throws IOException {
        if(marketModelJson == null)
            return null;

        return mapper.readValue(marketModelJson, MarketModel.class);
    }
}
