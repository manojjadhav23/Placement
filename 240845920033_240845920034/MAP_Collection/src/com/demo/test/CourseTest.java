package com.demo.test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Course;
import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

public class CourseTest {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	CourseService cs=new CourseServiceImpl();
	int ch=0;
	do {
		System.out.println("1. add new course\n2. delete course\n3. update course\n4. display all");
		System.out.println("5. display by name\n6. display based on duration\n7. display in sorted order of course name\n"
				+ "8. display in sorted order of duration\n9.exit\nchoice:");
		ch=sc.nextInt();
		
	 switch(ch)
	 {
	 case 1:boolean ans=cs.AddNewCourse();
	 		if(ans)
	 		{
	 			System.out.println("course added sucessfully");
	 		}
	 		else {
	 			System.out.println("duplicate object");
	 		}
		 break;
	 case 2:System.out.println("enter course name to delete");
	 		String cname=sc.next();
	 		
	 		boolean status=cs.DeleteByName(cname);
	 		if(status)
	 		{
	 			System.out.println("delete successfully");
	 		}
	 		else {
	 			System.out.println("not found");
	 		}
		 break;
	 case 3:System.out.println("Enter Name to Modify:");
	 		String name=sc.next();
	 		System.out.println("Enter Duration");
	 		int duration=sc.nextInt();
	 		System.out.println("Enter Capacity");
	 		int capacity=sc.nextInt();
	 		status=cs.ModifyCourse(name,duration,capacity);
	 		if(status) {
	 			System.out.println("Update Successfully");
	 		}else {
	 			System.out.println("Not Found");
	 		}
	 
		 break;
	 case 4:Map<String,Course> hm1=cs.DisplayAll();
	 		Set<String> s=hm1.keySet();
	 		s.stream().forEach(ob->System.out.println(ob+"-->"+hm1.get(ob)));
		 break;
	 case 5:System.out.println("Enter Course to Display");
	 		name=sc.next();
	 		status=cs.FindByName(name);
	 		if(status) {
	 			System.out.println("Found");
	 		}else {
	 			System.out.println("Not Found");
	 		}
	 
		 break;
	 case 6:
		 break;
	 }
	}while(ch!=9);
	}
}

