package com.greatlearning.lab6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Students")
public class Student {	
		
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			private int id;
			
			private String firstName;
			
			private String lastName;
			
			private String course;
			
			private String country;

			public Student() {
				super();
			}
			
			public Student(String firstName, String lastName, String course, String country) {
				super();
				this.firstName = firstName;
				this.lastName = lastName;
				this.course = course;
				this.country = country;
			}			
					
	}


