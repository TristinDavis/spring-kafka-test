package com.devon.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class Consumer {

    private static final Logger log = LoggerFactory.getLogger(Consumer.class);
    private static final AtomicLong count = new AtomicLong(1);

    @KafkaListener(id = "diwen_consumer", topics = "topic-10p-3r")
    public void listen(String data, Acknowledgment ack) {
       log.info(data +" count: "+count.getAndIncrement());

        ack.acknowledge();
    }
}
