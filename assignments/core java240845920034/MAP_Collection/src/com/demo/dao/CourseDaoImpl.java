package com.demo.dao;

import java.util.HashMap;
import java.util.Map;

import com.demo.beans.Course;

public class CourseDaoImpl implements CourseDao {
	static Map<String,Course> hm;
	
	static {
		hm=new HashMap<>();
		hm.put("DAC",new Course("DAC",10000,100,6));
        hm.put("DBDA",new Course("DBDA",20000,200,8));
        hm.put("DMC",new Course("DMC",30000,60,5));
	}
	@Override
	public boolean AddNewCourse(Course cobj) {
		Course c1=hm.putIfAbsent(cobj.getCname(), cobj);
		if(c1==null) {
			return true;
		}
		return false;
	}
	@Override
	public Map<String,Course> DisplayAll() {
		return hm;
		}
	@Override
	public boolean RemoveCourse(String cname) {
		Course c=hm.remove(cname);
		if(c!=null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean UpadateCourse(String name, int duration, int capacity) {
		Course c2 =hm.get(name);
		if(c2!=null) {
			c2.setDuration(duration);
			c2.setCapacity(capacity);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean FindByName(String name) {
		Course c2 =hm.get(name);
		if(name.equals(c2.getCname())) {
			System.out.println(hm.get(name));
			return true;
		}
		return false;
	}

}
