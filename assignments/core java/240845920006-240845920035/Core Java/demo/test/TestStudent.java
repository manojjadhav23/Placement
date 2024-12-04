package demo.test;
import java.util.*;
import demo.beans.Student;
import demo.services.StudentServices;
import demo.services.StudentServicesimpl;
public class TestStudent {
 static int choice;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentServices sservice=new StudentServicesimpl();
		choice=0;
		
		do {
			System.out.println("1.Add new Students\n2.Display Students \n3.search by id \n 4.delete by id\n 5.Modify Student Marks\n 11.Exit\nChoice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			         
			case 1->{
				
				   System.out.println("1. MasterStudent\n 2. GraduateStudent\n3. faculty\n choice: ");
			         int ch=sc.nextInt();
			         sservice.addnewStudent(ch);
			}
			case 2->
			{
				List<Student> studList=sservice.getAll();
				studList.stream().forEach(System.out::println);
			}
			
			case 3->{
				System.out.println("Enter student id");
				int id=sc.nextInt();
				Student s=sservice.getById(id);
				if(s!=null) {
					System.out.println(s);
				}
				else
				{
					System.out.println("Not found");
				}
				
			}
			case 4->{
				System.out.println("Enter id to delete student ");
				int id =sc.nextInt();
				boolean status=sservice.deleteById(id);
				if(status) {
					System.out.println("Student deleted successfulyy!!!!!!!");
				}
				else {
					System.out.println("not found");
				}
			}
			
			case 5->{
				System.out.println("Enter id to modify student marks ");
				int id =sc.nextInt();
				System.out.println("Enter marks ");
				int mks=sc.nextInt();
				boolean status=sservice.modifyMarks(id,mks);
			}
			case 11->{
				System.out.println("Thank you for visiting!!!!!!!!!!!!!");
				sc.close();
			}
			
			}
			
			
		}while(choice!=11);
		
	}
	}
	
	
