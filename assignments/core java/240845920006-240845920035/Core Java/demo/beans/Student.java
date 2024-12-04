package demo.beans;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Student extends Person {

	protected int[] marks;

	public Student() {
		//System.out.println("in student default constructor");
	}

	public Student(int pid, String pname, String address, LocalDate bdate,int[] marks) {
		super(pid,pname,address,bdate); 
	//	System.out.println("in student parametrized constructor");
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	abstract public float calculateGrade();

	@Override
	public String toString() {
		return super.toString()+"Student [marks=" + Arrays.toString(marks) + "]";
	}
}
