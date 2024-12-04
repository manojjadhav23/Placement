package com.iet.services;

import java.util.Map;

import com.iet.bean.Course;

public interface CourseService {

	boolean addnewcourse();

	Map<String, Course> getAll();

	boolean deleteByName(String cn);

}
