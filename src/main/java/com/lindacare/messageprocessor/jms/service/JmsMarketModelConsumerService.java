package com.lindacare.messageprocessor.jms.service;

import com.lindacare.messageprocessor.converter.MarketModelConverter;
import com.lindacare.messageprocessor.dao.MarketModel;
import com.lindacare.messageprocessor.dao.MarketModelRepository;
import com.lindacare.messageprocessor.validator.MarketModelValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JmsMarketModelConsumerService {

    @Autowired
    private MarketModelRepository marketModelRepository;

    public void convertAndSaveMarketModel(String marketModelJson) throws Exception {
        MarketModel marketModel = MarketModelConverter.json2MarketModel(marketModelJson);
        System.out.println("Recieved Message: " + marketModel);
        MarketModelValidator.isValidMarketModel(marketModel);
        marketModelRepository.save(marketModel);
    }
}
