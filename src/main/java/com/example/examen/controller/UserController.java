package com.example.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entities.User;
import com.example.examen.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController  {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public List<User> getUsersAll() {

		return userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUserbyId(@PathVariable Integer id) {
		
		Optional<User> user = userRepository.findById(id);
		
		if (user.isPresent()) {
			return user.get();
		}
		
		return null;

	}

}
