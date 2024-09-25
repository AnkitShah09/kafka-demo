package com.demo.kafka.service.impl;

import com.demo.kafka.service.KafkaConsumerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.demo.kafka.constants.KafkaConstants.GROUP_ID;
import static com.demo.kafka.constants.KafkaConstants.TOPIC;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    @Override
    @KafkaListener(id="myConsumer", topics = {TOPIC}, groupId = GROUP_ID)
    public void consumeMessage(String message) {
        System.out.println("------------------------------------------");
        System.out.println(message);
        System.out.println("------------------------------------------");
    }
}
