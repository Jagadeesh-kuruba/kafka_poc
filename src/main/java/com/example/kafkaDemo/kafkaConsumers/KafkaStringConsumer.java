package com.example.kafkaDemo.kafkaConsumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaStringConsumer {

    @KafkaListener(topics = "family",groupId = "myGroup")
    public void readMessage(String message){
        log.info("Kafka Message Received from topic"+" family is "+message);
    }
}
