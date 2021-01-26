package com.jonasbernardino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasbernardino.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
