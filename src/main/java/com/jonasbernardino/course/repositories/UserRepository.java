package com.jonasbernardino.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonasbernardino.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
