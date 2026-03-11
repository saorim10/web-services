package com.saorim.web_services.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.saorim.web_services.entity.User;
import com.saorim.web_services.repository.UserRepository;
import com.saorim.web_services.service.exception.DatabaseException;
import com.saorim.web_services.service.exception.ResourceNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service	
public class UserService {

	private final UserRepository repository;
	
	public User create(User obj) {
		return repository.save(obj);
	}
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(int id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User update(int id, User user) {
		User obj = repository.getReferenceById(id);
		obj.setName(user.getName());
		obj.setEmail(user.getEmail());
		obj.setPhone(user.getPhone());
		return repository.save(obj);
	}
	
	public void delete(int id) {
		if (!repository.existsById(id)) {
	        throw new ResourceNotFoundException(id);
	    }
		try {
			repository.deleteById(id);
		} catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
}
