package com.saorim.web_services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saorim.web_services.entity.Product;
import com.saorim.web_services.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {

	private final ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(int id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
