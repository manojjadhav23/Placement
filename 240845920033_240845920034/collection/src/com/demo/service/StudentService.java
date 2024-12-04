package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	void AddNewStudent(int ch);

	List<Student> DisplayAll();

	boolean DeleteById(int id);

	

	

}
