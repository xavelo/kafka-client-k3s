package com.xavelo.kafkaclientk3s;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "java-consumer")
    public void consume(String message) {
        System.out.println("> Consumed message: " + message);
    }
}
