package com.example.donut.dao;

import com.example.donut.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemDao extends JpaRepository<OrderItem, Integer> {
}
