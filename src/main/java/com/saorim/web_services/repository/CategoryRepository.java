package com.saorim.web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saorim.web_services.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
