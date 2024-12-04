package com.iet.services;

import java.util.Set;

import com.iet.bean.Course;
import com.iet.dao.CourseDao;
import com.iet.dao.CourseDaoImpl;

import java.util.Scanner;
import java.util.Map;

public class CourseServiceImpl implements CourseService{

	private CourseDao cdao;
	public CourseServiceImpl() {
	cdao=new CourseDaoImpl();
	}
	@Override
	public boolean addnewcourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name");
		String nm=sc.next();
		System.out.println("Enter duration");
		int duration=sc.nextInt();
		System.out.println("capacity");
		int capacity=sc.nextInt();
		System.out.println("enter fees");
		double fees=sc.nextDouble(); 
		Course c=new Course(nm,fees,capacity,duration);
		return cdao.save(c);
	}
	@Override
	public Map<String, Course> getAll() {
		
		return cdao.findAll();
	}
	@Override
	public boolean deleteByName(String cn) {
		
		return cdao.deleteByName(cn);
	}

}
