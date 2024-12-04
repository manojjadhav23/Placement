package com.demo.beans;

public class MyClass {

	synchronized public void PrintTables(int n) {
		for(int i=1;i<11;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		
	}

	public void Factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is: "+fact);
	}

	public void Sum(MyClass ob, int n) {
		int sum=0;
		while(n>0){
			int d=n%10;
			n=n/10;
			sum=sum+d;
		}
		System.out.println("Sum is"+sum);
		
	}
	
}
