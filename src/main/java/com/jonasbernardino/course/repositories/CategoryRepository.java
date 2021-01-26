package com.jonasbernardino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasbernardino.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
