package com.devon.demo.springkafkatest;

import com.devon.demo.config.KafkaConfig;
import com.devon.demo.consumer.Consumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KafkaConfig_test.class})
public class SpringKafkaTestApplicationTests {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Test
    public void producer() throws InterruptedException {

        for(int x = 0 ; x < 100; x++){
            kafkaTemplate.send("topic-10p-3r","from topic-10p-3r");
            Thread.sleep(500);
         //   kafkaTemplate.send("test","from test");
        }
    }

}
