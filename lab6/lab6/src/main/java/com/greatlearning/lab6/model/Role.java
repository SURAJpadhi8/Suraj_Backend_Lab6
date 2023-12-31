package com.greatlearning.lab6.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
	@Data
		@Table(name = "Roles")
	public class Role {
	    @Id
	    @Column(name = "role_id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name="name")
	    private String name; 
	}
