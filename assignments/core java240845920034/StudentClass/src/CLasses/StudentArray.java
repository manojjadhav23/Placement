package CLasses;
import java.util.*;
public class StudentArray {
	private static Student[] studarr; 
	private static int cnt;
	static {
		studarr=new Student[10];
		studarr[0]= new Student(33,"Harsh",50,50,50);
		studarr[1]= new Student(32,"JAdhav",50,63,70);
		studarr[2]= new Student(23,"Don",80,50,55);
		cnt=3;
	}
	public static int DisplayStudent() {
		for(Student s:studarr) {
			if(s!=null) {
		System.out.println(s);
			}else {
				break;
			}
		}
			return 0;
	}
	public static void AddNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter name");
		String name =sc.next();
		
		System.out.println("enter marks1");
	    float m1 =sc.nextInt();
		
		System.out.println("enter marks2");
		float m2=sc.nextInt();
		
	    System.out.println("enter marks3");
		float m3=sc.nextInt();
		
		studarr[cnt]=new Student(id,name,m1,m2,m3);
		cnt++;
	}
	public static void SearchById() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id for search");
		int s=sc.nextInt();
		for(Student s1: studarr) {
			if(s1!=null) {
			if(s1.getid()==s) {
				System.out.println(s1);
				System.out.println("Id is Found");
				break;
			}
			}
			else {
				System.out.println("Id not Found");
				break;
			}
		}
		
	}
	public static Student SearchByName(String s) {
		for(Student s2:studarr)
		{    if(s2!=null) {
			if(s2.getname().equals (s)) {
//				System.out.println(s2);
				System.out.println("Name is found");
			    return s2;
				}
			}
			else {
				System.out.println("Name is not Found");
			     return null;
			}
			
			
		}
		return null;
	}
	public static void DeleteById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to delete");
		int sss=sc.nextInt();
		for(int i=0;i<cnt;i++) {
			if(studarr[i].getid()==sss) {
				for(int j=i;j<cnt;j++) {
					studarr[j]=studarr[j+1];
				}
				System.out.println("Successfully Delete");
				cnt--;
			}
		}
		System.out.println("Not Found");
		
	}
	public static void FindAverageMarksById() {
		Scanner sc=new Scanner(System.in);
		float sum=0;
		float avg;
		System.out.println("enter id to find average");
		int id=sc.nextInt();
		for(Student s:studarr) {
			if(s.getid()==id) {
				float m1=s.getm1();
				float m2=s.getm2();
				float m3=s.getm3();
				sum=m1+m2+m3;
				avg=sum/3;
				System.out.println("Average is:"+avg);
				break;
			}
		}
		
		
		
	}
}
