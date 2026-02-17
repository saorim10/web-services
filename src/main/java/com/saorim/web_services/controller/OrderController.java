package com.saorim.web_services.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saorim.web_services.entity.Order;
import com.saorim.web_services.service.OrderService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	private final OrderService service;
	
	@GetMapping()
	public ResponseEntity<List<Order>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable int id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
