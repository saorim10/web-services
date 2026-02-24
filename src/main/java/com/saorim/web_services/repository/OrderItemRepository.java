package com.saorim.web_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saorim.web_services.entity.OrderItem;
import com.saorim.web_services.entity.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
