package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoimpl;

public class StudentServiceimpl implements StudentService{
	Scanner sc= new Scanner(System.in);
	private StudentDao sd;
	Student s=null;
	public StudentServiceimpl() {
		super();
		sd=new StudentDaoimpl();
	}

	@Override
	public void AddNewStudent(int ch) {
		System.out.println("Enter id:");
		int id=sc.nextInt();
		System.out.println("Enter Name:");
		String nm=sc.next();
		System.out.println("Enter Address:");
		String addr=sc.next();
		System.out.println("Enter Birthday:");
		String bdate=sc.next();
		LocalDate ldt=LocalDate.parse(bdate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		int []mks=new int[2];
		if(ch==1 || ch==2) {
			System.out.println("Enter Marks of First: ");
			mks[0]=sc.nextInt();
			System.out.println("Enter Marks of Second: ");
			mks[1]=sc.nextInt();
		}
		
		if(ch==1) {
			System.out.println("Enter Special Subject Marks:");
			int splmarks=sc.nextInt();
			s=new GraduateStudent(id,nm,addr,ldt,mks,splmarks);
		}
		
		else if(ch==2) {
			System.out.println("Enter Degeree:");
			String deg=sc.next();
			System.out.println("Enter Thesis Subject:");
			String sub=sc.next();
			System.out.println("Enter Thesis Subject Marks:");
			int smark=sc.nextInt();
			s=new MasterStudent(id,nm,addr,ldt,mks,deg,sub, smark);
		}
		sd.AddNewStudent(s);

		
	}

	@Override
	public List<Student> DisplayAll() {
		return sd.DisplayAll();
	}

	@Override
	public boolean DeleteById(int id) {
	     return sd.removeById(id);
		
	}


	}


	

