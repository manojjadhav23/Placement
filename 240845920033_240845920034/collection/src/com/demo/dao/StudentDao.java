package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	void AddNewStudent(Student s);

	List<Student> DisplayAll();

	boolean removeById(int id);

	




}
