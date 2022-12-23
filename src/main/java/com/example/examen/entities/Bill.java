package com.example.examen.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Bill {
	
	private Integer id;
	private String date_bill;
	@ManyToOne
	@JoinColumn(name="users_id")
	private User user;
	private Integer value;
	private Integer type;
	private String observation;

}
