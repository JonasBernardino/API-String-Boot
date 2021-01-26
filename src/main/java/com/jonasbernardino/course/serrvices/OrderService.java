package com.jonasbernardino.course.serrvices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonasbernardino.course.entities.Order;
import com.jonasbernardino.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Optional<Order> findById(Long id) {
		return orderRepository.findById(id);
	}

}
