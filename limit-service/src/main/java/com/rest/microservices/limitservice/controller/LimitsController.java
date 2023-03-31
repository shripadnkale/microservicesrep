package com.rest.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.microservices.limitservice.bean.Limits;
import com.rest.microservices.limitservice.config.Config;

@RestController
public class LimitsController {
	
	@Autowired
	private Config config;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(config.getMinimum(),config.getMaximum());
		//return new Limits(1,100);
		
	}
}
