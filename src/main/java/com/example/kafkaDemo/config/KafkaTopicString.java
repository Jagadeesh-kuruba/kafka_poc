package com.example.kafkaDemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicString {

    @Bean
    public NewTopic stringTopic(){
        return TopicBuilder.name("family").build();
    }

}
