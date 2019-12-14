package com.group.project.baseApplication.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group.project.baseApplication.model.Order;

@RestController

public class TestController {
	
	
	@Autowired
	private KieSession kieSession;

	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) {
		kieSession.insert(order);
		kieSession.fireAllRules();
		return order;

	}

}