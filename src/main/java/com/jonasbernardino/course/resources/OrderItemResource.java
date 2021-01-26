package com.jonasbernardino.course.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jonasbernardino.course.entities.OrderItem;
import com.jonasbernardino.course.serrvices.OrderItemService;

@RestController
@RequestMapping(value = "/orderItens")
public class OrderItemResource {

	@Autowired
	private OrderItemService service;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		 List<OrderItem> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<OrderItem>> findById(@PathVariable Long id){
		Optional<OrderItem> obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
