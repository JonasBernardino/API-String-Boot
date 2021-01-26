package com.jonasbernardino.course.serrvices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonasbernardino.course.entities.OrderItem;
import com.jonasbernardino.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository userRepository;
	
	public List<OrderItem> findAll() {
		return userRepository.findAll();
	}
	
	public Optional<OrderItem> findById(Long id) {
		return userRepository.findById(id);
	}

}
