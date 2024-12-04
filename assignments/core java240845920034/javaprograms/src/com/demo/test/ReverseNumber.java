//Reverse Number

package com.demo.test;
import java.util.Scanner;
class ReverseNumber{

  		public static void main(String[] args){
                    
                     Scanner sc=new Scanner(System.in);
                     System.out.println("Enter number");
                             int n=sc.nextInt();                                             
			     int og=n;

                         int reverse=0;
                   
                        for(int i=n;i>0;){
                              int digit=i%10;
			      reverse=reverse*10+digit;
                               i=i/10;
                         }
                   
		System.out.println("Reverse Number is:"+reverse);
  }
}