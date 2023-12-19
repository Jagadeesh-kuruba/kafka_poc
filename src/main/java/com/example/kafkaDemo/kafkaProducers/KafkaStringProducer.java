package com.example.kafkaDemo.kafkaProducers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaStringProducer {
    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaStringProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        log.info("Message Sent to the Kafka Topic"+" family is "+message);
        kafkaTemplate.send("family",message);
    }
}
