package com.indoo.customer.services;

import com.indoo.customer.services.kafka.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private KafkaProducer kafkaProducer;

    public void sendKafkaMessage(String message) {
        kafkaProducer.sendMessage(message);
    }
}
