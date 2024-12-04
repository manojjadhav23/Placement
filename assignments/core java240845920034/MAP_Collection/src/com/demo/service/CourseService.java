package com.demo.service;

import java.util.Map;

import com.demo.beans.Course;

public interface CourseService {

	boolean AddNewCourse();

	Map<String, Course> DisplayAll();

	boolean DeleteByName(String cname);

	boolean ModifyCourse(String name, int duration, int capacity);

	boolean FindByName(String name);

	

}
