package com.demo.dao;

import java.util.Map;

import com.demo.beans.Course;

public interface CourseDao {

	boolean AddNewCourse(Course cobj);

	Map<String, Course> DisplayAll();

	boolean RemoveCourse(String cname);

	boolean UpadateCourse(String name, int duration, int capacity);


	boolean FindByName(String name);


}
