package com.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceimpl;

public class TestStudent {

	public static void main(String[] args) {
		StudentService s=new StudentServiceimpl();
		Scanner sc= new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Add New Student \n2.Delete Student by Id \n3.Modify Marks \n4.Search By ID \n5.Search By Marks>Given Marks"
					+ "\n6.Sort By Id \n7.Sort By Name \n8.Sort By Marks \n9.Display All \nChoice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("1.Graduate Student \n2.Master Student \nChoice:");
				   int ch=sc.nextInt();
				   s.AddNewStudent(ch);
				break;
			case 2: System.out.println("Enter id for delete");
			 		int id=sc.nextInt();
				    boolean status=s.DeleteById(id);
				    if(status)
				    {
				    	System.out.println("array list delete successfully");
				    }
				    else {
				    	System.out.println("Array list is not found");
				    }
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:

				break;
			case 7:
				break;
			case 8:
				break;
			case 9:List<Student> s1=s.DisplayAll();
				   s1.stream().forEach(System.out::println);
				break;
			default:System.out.println("Wrong Input");
			}
		}while(choice!=11);
	}

}
