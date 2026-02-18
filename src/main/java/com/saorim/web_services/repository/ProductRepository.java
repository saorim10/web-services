package com.saorim.web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saorim.web_services.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
