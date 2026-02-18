package com.saorim.web_services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saorim.web_services.entity.Category;
import com.saorim.web_services.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoryService {
	
	private final CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(int id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
