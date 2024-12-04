//program 02
package com.demo.test;
import java.util.Scanner;
class Sum{

       public static void main(String[] args){
		
		int sum=0;		
             Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");

	    int a=sc.nextInt();

	System.out.println("Enter Number");
	int b=sc.nextInt();
	sum=a+b;
	System.out.println("Sum is:"+sum);
}
}