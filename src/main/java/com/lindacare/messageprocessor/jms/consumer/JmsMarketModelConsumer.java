package com.lindacare.messageprocessor.jms.consumer;

import com.lindacare.messageprocessor.jms.service.JmsMarketModelConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsMarketModelConsumer {

        @Autowired
        private JmsMarketModelConsumerService jmsMarketModelConsumerService;

        @JmsListener(destination = "${jsa.activemq.queue}", containerFactory="jsaFactory")
        public void receive(String msg) throws Exception {
            jmsMarketModelConsumerService.convertAndSaveMarketModel(msg);
        }

}
