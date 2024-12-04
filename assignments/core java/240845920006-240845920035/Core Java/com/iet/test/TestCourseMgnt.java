package com.iet.test;
import java.util.Set;

import com.iet.bean.Course;
import com.iet.services.*;

import java.util.List;
import java .util.Scanner;
import java.util.Map;
           public class TestCourseMgnt {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		CourseService cservice=new  CourseServiceImpl();
		int choice=0;
		do {
			System.out.println("1.Add new course\n 2.delete course\n 3.Display All\n9.Exit\nChoice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				
				boolean status =cservice.addnewcourse();
				if(status) {
					System.out.println("Course added");
					
				}
				else {
					System.out.println("Duplicate Object");
				}
				break;
				
			case 2:
				System.out.println("Enter course name to delete");
				String cn=sc.next();
				status=cservice.deleteByName(cn);
				if(status) {
					System.out.println("Course Deleted");
				}else {
					System.out.println("Not found");
				}
				break;
				
			case 3:
				Map<String,Course> hm1=cservice.getAll();
				Set<String> s=hm1.keySet();
				s.stream().forEach(ob->System.out.println(ob+"--------->"+hm1.get(ob)));
				break;
				
			case 9:
				System.out.println("Thank you for visiting!!!!!!!!!!!");
				sc.close();
				break;
			}
		}while(choice!=9);
		
	}

}
