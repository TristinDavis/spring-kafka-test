package com.devon.demo.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.ErrorHandler;

public class MyErrorHandler implements ErrorHandler {

    private static final Logger log = LoggerFactory.getLogger(MyErrorHandler.class);
    @Override
    public void handle(Exception thrownException, ConsumerRecord<?, ?> data) {
        log.error(thrownException.getMessage(),thrownException);
    }
}
