package demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import demo.beans.MasterStudent;
import demo.beans.Person;
import demo.beans.Student;
import demo.beans.graduateStudent;

public class StudentServicedaoimpl implements StudentServicedao {

	private static List<Student> studList;
	static {
		studList=new ArrayList<>();
		studList.add(new graduateStudent(10,"neha","pune",LocalDate.of(2002,12,06),new int [] {70,80},88));
		studList.add(new MasterStudent(14, "Sahil", "Mumbai", LocalDate.of(2002, 01, 03), new int[] {88,87},"accounts","BCOM",89));
	}
	@Override
	public void addStudent(Student s) {
		studList.add(s);
		
	}
	@Override
	public List<Student> findAll() {
		return studList;
		
	}

	@Override
	public Student findById(int id) { 
	
		int pos=studList.indexOf(new Person(id));
		if(pos!=-1) {
			return studList.get(pos);
		}
		return null;
		
	}
	@Override
	public boolean deleteById(int id) {
		return studList.remove(new Person(id));
	}
	@Override
	public boolean modifyMarks(int id, int mks) {
	
		Student s=findById(id);
		if(s!=null) {
			if(s instanceof MasterStudent) {
				((MasterStudent)s).setThesismarks(mks);
				return true;
			}else if(s instanceof graduateStudent ) {
				((graduateStudent)s).setSpsub(mks);
				return true;
		}
		return false;
		}
		return false;
	}
}
