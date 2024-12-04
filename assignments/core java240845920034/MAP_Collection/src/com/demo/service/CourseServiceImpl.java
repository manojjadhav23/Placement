package com.demo.service;

import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Course;
import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService{
	private CourseDao cdao;
	
	public CourseServiceImpl() {
		cdao=new CourseDaoImpl();
	}
	@Override
	public boolean AddNewCourse() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter course name");
	  String name=sc.next();
	  System.out.println("enter course fees");
	  double fee=sc.nextDouble();
	  System.out.println("enter course capacity");
	  int capacity=sc.nextInt();
	  System.out.println("enter course duration");
	  int duration=sc.nextInt();
	  Course cobj=new Course(name,fee,capacity,duration);
	  return cdao.AddNewCourse(cobj);
	}
	@Override
	public Map<String, Course> DisplayAll() {
		return cdao.DisplayAll();
	}
	@Override
	public boolean DeleteByName(String cname) {
		return cdao.RemoveCourse(cname);
	}
	@Override
	public boolean ModifyCourse(String name, int duration, int capacity) {
		return cdao.UpadateCourse(name,duration,capacity);
	}
	@Override
	public boolean FindByName(String name) {
		return cdao.FindByName(name);
	}
	
}
