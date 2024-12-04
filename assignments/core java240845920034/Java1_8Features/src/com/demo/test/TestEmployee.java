package com.demo.test;

import java.util.List;

import com.demo.beans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> lst = List.of(new Employee(1,"Harsh",2000,200),new Employee(2,"Jadhav",20000,3000),new Employee(3,"Don",4000,300));
		lst.stream().filter(emp->emp.getSal()==2000).forEach(System.out::println);
	}

}
