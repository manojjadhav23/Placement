package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Person;
import com.demo.beans.Student;

public class StudentDaoimpl implements StudentDao {
	 private static List<Student> studlist; 
	 
	 static {
		 studlist=new ArrayList<>();
		 studlist.add(new GraduateStudent(10,"Harsh","ABC",LocalDate.of(2002, 10, 20),new int[]{50,50},50));
		 studlist.add(new GraduateStudent(13,"Jadhav","ABC",LocalDate.of(2005, 10, 20),new int[]{60,70},80));
		 studlist.add(new MasterStudent(12,"Manoj","WWW",LocalDate.of(2002, 10, 15),new int[] {50,60},"Physics","M.Tech",50));
		 studlist.add(new MasterStudent(11,"Don","WWW",LocalDate.of(2002, 12, 15),new int[] {55,66},"Physics","M.Tech",60));
	 }

	@Override
	public void AddNewStudent(Student s) {
		studlist.add(s);
	}

	@Override
	public List<Student> DisplayAll() {
		return studlist;
	}

	@Override
	public boolean removeById(int id) {
		return studlist.remove(new Person(id,null,null,null));
	}

	

	
}
