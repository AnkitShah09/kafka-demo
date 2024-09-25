package com.demo.kafka.service.impl;

import com.demo.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

import static com.demo.kafka.constants.KafkaConstants.TOPIC;

@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String message) {
        CompletableFuture<SendResult<String, String>> send = kafkaTemplate.send(TOPIC, message);
        send.thenAccept(System.out::println);
    }

}
