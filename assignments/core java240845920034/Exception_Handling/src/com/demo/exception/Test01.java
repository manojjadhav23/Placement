package com.demo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<3;i++) {
	try {	
		System.out.println("enter number 1");
		int no1=sc.nextInt();

		System.out.println("enter number 2");
		int no2=sc.nextInt();
		
		int sum=no1+no2;
		System.out.println("sum is="+sum);
		System.out.println("------------------------------------------------------------");
		int div=no1/no2;
		System.out.println("division is:"+div);
		System.out.println("-------------------------------------------------------------");
		String s=null;
		s=sc.next();
		System.out.println("Length"+s.length());
//		break;
	}catch(InputMismatchException obj) {
		System.out.println("enter only enter no not allowed string");
		System.out.println(obj.getMessage());
		sc.nextLine();
	}catch(ArithmeticException obj) {
		System.out.println("can not devied by zero");
	}catch(NullPointerException e) {
		System.out.println(e.getMessage()); 
	}
		}

	}


