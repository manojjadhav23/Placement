package com.demo.test;

import java.util.Arrays;

public class String2 {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1="test";
		s1=s1.concat("abc");
		
		s1=s1.replace("test", "manoj");
		System.out.println(s1);
		StringBuilder sc=new StringBuilder("test");
		sc.append("welcone");
		System.out.println(sc);
		
		StringBuffer sb=new StringBuffer("manoj");
		sb.append("jadhav");
		System.out.println(sb);
		
		String s5="xxx,yy,zz-yy";
		
		String[] s=s5.split(",");
		Arrays.stream(s).forEach(System.out::print);
		System.out.println();
		String s3="abcd";
		String s2=s1.join(":",s);
		System.out.println(s2);
		
		String s6="happy life";
		System.out.println(s6.matches(".*fe")); 
		System.out.println(s6.matches("^ha.*")); 

	}
}
