package com.example.kafkaDemo.controller;

import com.example.kafkaDemo.kafkaProducers.KafkaStringProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {

    @Autowired
    private KafkaStringProducer kafkaStringProducer;

    // http://localhost:8089/api/v1/kafka/stringData?message=Hello Nanna
    @GetMapping("/stringData")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaStringProducer.sendMessage(message);
        return ResponseEntity.ok("Message Sent to the TOPIC Successfully");
    }

}
