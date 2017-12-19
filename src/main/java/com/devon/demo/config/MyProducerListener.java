package com.devon.demo.config;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.ProducerListener;

public class MyProducerListener implements ProducerListener {

    private static final Logger logger = LoggerFactory.getLogger(MyProducerListener.class);
    @Override
    public void onSuccess(String topic, Integer partition, Object key, Object value, RecordMetadata recordMetadata) {
        logger.info("=========================On Success {}",(String)value);
    }

    @Override
    public void onError(String topic, Integer partition, Object key, Object value, Exception exception) {
        logger.error("topic: {} - exception: {}", topic, exception);
    }

    @Override
    public boolean isInterestedInSuccess() {
        return false;
    }
}
