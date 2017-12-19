package com.devon.demo.springkafkatest;

import com.devon.demo.config.KafkaConfig;
import com.devon.demo.consumer.Consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({KafkaConfig.class, Consumer.class})
public class SpringKafkaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaTestApplication.class, args);
    }
}
