package com.indoo.customer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.indoo.customer.services.CustomerService;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        customerService.sendKafkaMessage(message);
        return "Message sent to Kafka topic!";
    }
}
