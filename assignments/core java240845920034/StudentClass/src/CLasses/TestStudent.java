package CLasses;
import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("1)Display Student \n2)Add Student \n3)Search by Id \n4)Search by Name \n5)Delete by Id \n6)Find average marks \nChoice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:StudentArray.DisplayStudent();
				break;
			case 2:
				StudentArray.AddNewStudent();
				break;
			case 3:
				  StudentArray.SearchById();
				break;
			case 4:
				  System.out.println("enter name for search");
				  String s=sc.next();
				  Student ss=StudentArray.SearchByName(s);
				  System.out.println(ss);
				break;
			case 5:
				StudentArray.DeleteById();
				break;
				
			case 6:StudentArray.FindAverageMarksById();
				break;
			}
		}while(choice!=7);
		

	}

}
























//Student s1=new Student(33,"Harsh",50,50,50);
//System.out.println(s1);
//Student s2=new Student(34,"Manoj",60,60,60);
//System.out.println(s2);
//Student s3=new Student(33,"Harsh",50,50,50);
//System.out.println(s3);
