package com.saorim.web_services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saorim.web_services.entity.User;
import com.saorim.web_services.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

	private final UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(int id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
