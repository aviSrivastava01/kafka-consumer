package com.kafka.consumer.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaMessageListner {

    Logger log =  LoggerFactory.getLogger(KafkaMessageListner.class);

    @KafkaListener(topics = "Avi", groupId = "avi-group-1")
    public void consume(String message){
        log.info("Consumes the message"+message);
    }

}
