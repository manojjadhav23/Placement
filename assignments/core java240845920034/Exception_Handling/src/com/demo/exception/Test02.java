package com.demo.exception;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("enter number 1");
		int no1=sc.nextInt();

		System.out.println("enter number 2");
		int no2=sc.nextInt();
		
		if(no1>no2) {
			throw new MyException("hii");
		}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
