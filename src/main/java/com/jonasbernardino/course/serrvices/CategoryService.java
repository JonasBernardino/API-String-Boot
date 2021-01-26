package com.jonasbernardino.course.serrvices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonasbernardino.course.entities.Category;
import com.jonasbernardino.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository orderRepository;
	
	public List<Category> findAll() {
		return orderRepository.findAll();
	}
	
	public Optional<Category> findById(Long id) {
		return orderRepository.findById(id);
	}

}
