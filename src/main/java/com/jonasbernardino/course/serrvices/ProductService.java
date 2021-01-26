package com.jonasbernardino.course.serrvices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonasbernardino.course.entities.Product;
import com.jonasbernardino.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository orderRepository;
	
	public List<Product> findAll() {
		return orderRepository.findAll();
	}
	
	public Optional<Product> findById(Long id) {
		return orderRepository.findById(id);
	}

}
