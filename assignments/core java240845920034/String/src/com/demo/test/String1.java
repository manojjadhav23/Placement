package com.demo.test;

public class String1 {
	public static void main(String[] args) {
		String s1="hello";
		String s2="text";
		String s3=s1;
		String s4=new String("hello");
		System.out.println(""+(s3==s1));
		System.out.println("equal :"+s4.equals(s1));
	}
}
