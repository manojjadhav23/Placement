package demo.dao;

import java.util.List;

import demo.beans.Student;

public interface StudentServicedao {

	void addStudent(Student s);

	List<Student> findAll();

	Student findById(int id);

	boolean deleteById(int id);

	boolean modifyMarks(int id, int mks);

	

}
