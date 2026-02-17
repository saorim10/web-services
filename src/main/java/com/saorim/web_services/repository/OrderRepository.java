package com.saorim.web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saorim.web_services.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
