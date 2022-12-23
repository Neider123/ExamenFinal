package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
