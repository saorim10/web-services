package com.saorim.web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saorim.web_services.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
