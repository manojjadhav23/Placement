package demo.services;
import demo.beans.*;
import demo.dao.*;
import demo.services.*;
import demo.test.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;





public class StudentServicesimpl implements StudentServices {
      
	private StudentServicedao sdao;
	
	public StudentServicesimpl()
	{
		super();
		sdao=new StudentServicedaoimpl();
		
	}
	@Override
	public void addnewStudent(int ch) {
		 Scanner sc=new Scanner(System.in);

		System.out.println("stydent id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter address");
		String addr=sc.next();
		System.out.println("enter birth date(dd/MM/yyyy)");
		String bdt=sc.next();
		LocalDate ldt=LocalDate.parse(bdt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		int[] mks=new int[2];
		if(ch==1 || ch==2) {
			System.out.println("enetr marks 1");
			mks[0]=sc.nextInt();
			System.out.println("enetr marks 2");
			mks[1]=sc.nextInt();
			
			Student s=null;
			if(ch==1) {
				System.out.println("enter thesis sub");
				String sub=sc.next();
				System.out.println("enter graduation degree");
				String degree=sc.next();
				System.out.println("enter thesis marks");
				int marks=sc.nextInt();
				s=new MasterStudent(id, nm, addr, ldt, mks, sub, degree, marks);
				
			}else if (ch==2){
				System.out.println("enter Special subject marks");
				int marks=sc.nextInt();
			    s=new graduateStudent(id, nm, addr, ldt, mks, marks);
			}else {
				
			}
		sdao.addStudent(s);
	}

}
	@Override
	public List<Student> getAll() {
	
		return sdao.findAll();
	}
	@Override
	public Student getById(int id) {
			
		return sdao.findById(id);
		
		
	}
	@Override
	public boolean deleteById(int id) {
	
		return sdao.deleteById(id);
	}
	@Override
	public boolean modifyMarks(int id, int mks) {
		
		return sdao.modifyMarks(id,mks);
	}
}
