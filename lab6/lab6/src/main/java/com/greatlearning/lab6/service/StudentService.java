package com.greatlearning.lab6.service;

import java.util.List;

import com.greatlearning.lab6.model.Student;

public interface StudentService {

	List<Student> findAll();

	Student findById(int theId);

	void save(Student theStudent);

	void deleteById(int theId);

	

}