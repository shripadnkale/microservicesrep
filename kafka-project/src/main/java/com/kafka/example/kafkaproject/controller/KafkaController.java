package com.kafka.example.kafkaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("kafka")
public class KafkaController {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	String topic = "Kafka_Example";
	
	@GetMapping("/publish/{message}")
	public String publishMessage(@PathVariable("message") String message) {
		kafkaTemplate.send(topic, message);
		return "Published successfully";
	}
	
	/*@GetMapping("/publish/{name}")
	public String publishUser(@PathVariable("name") String name) {
		kafkaTemplate.send(topic, new User(name, "Technology", 12000L));
		return "Published successfully";
	}*/

}
