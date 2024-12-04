package com.iet.dao;

import java.util.Map;

import com.iet.bean.Course;

import java.util.HashMap;

public class CourseDaoImpl implements CourseDao {

	static Map<String ,Course> hm;
	static {
		hm=new HashMap<>();
		hm.put("DAC", new Course("abc",3000.00,200,400));
		hm.put("JAVA", new Course("xyz",2000.00,500,100));
	}
	@Override
	public boolean save(Course c) {
		
		Course c1=hm.putIfAbsent(c.getName(), c);
		if(c1==null)
			return true;
		return false;
	}
	@Override
	public Map<String, Course> findAll() {
	
		return hm;
	}
	@Override
	public boolean deleteByName(String cn) {
		Course c1=hm.remove(cn);
		if(c1!=null) {
			return true;
		}
		return false;
	}

}
