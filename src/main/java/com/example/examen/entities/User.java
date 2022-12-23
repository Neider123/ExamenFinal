package com.example.examen.entities;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
	
	private Integer id;
	private String username;
	private String pass;
	private String email;
	
	@JsonIgnore
	@OneToMany(mappedBy="user")
	private List<Bill> bills;
	
	

}
