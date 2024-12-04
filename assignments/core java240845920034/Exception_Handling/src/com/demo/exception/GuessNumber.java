package com.demo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= 23;
		while(true) {
		try {
		System.out.println("Enter a Number");
		int a1=sc.nextInt();
		if(a1!=a) {
			throw new WrongNumberException("Oops Wrong");
		}else {
			System.out.println("You Win:"+a);
		}
		}catch(InputMismatchException e) {
			System.out.println("String Value not Allowed");
		}catch(WrongNumberException e) {
			System.out.println(e.getMessage());
		}
		}
	}
}
		

	
