package demo.services;

import java.util.List;

import demo.beans.Student;

public interface StudentServices {



void addnewStudent(int ch);

List<Student> getAll();

Student getById(int id);

boolean deleteById(int id);

boolean modifyMarks(int id, int mks);

}
