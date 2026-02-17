package com.saorim.web_services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saorim.web_services.entity.Order;
import com.saorim.web_services.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService {
	
	private final OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(int id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
