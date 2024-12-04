package com.iet.dao;

import java.util.Map;

import com.iet.bean.Course;

public interface CourseDao {

	boolean save(Course c);

	Map<String, Course> findAll();

	boolean deleteByName(String cn);

}
