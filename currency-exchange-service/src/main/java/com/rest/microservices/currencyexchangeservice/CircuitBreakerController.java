package com.rest.microservices.currencyexchangeservice;

import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
	//@Retry(name="sample-api")
	@CircuitBreaker(name="default", fallbackMethod="hardcodedResponse")
	public String sampleApi() {
		logger.info("Samle api to be mapped");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8002/some-dummy-url", 
				String.class);
		
		return forEntity.getBody();
	}

}
