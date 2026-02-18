package com.saorim.web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saorim.web_services.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
