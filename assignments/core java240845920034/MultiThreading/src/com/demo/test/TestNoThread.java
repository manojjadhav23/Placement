package com.demo.test;

import com.demo.beans.MyClass;

public class TestNoThread {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.PrintTables(7);
		
		obj.Factorial(5);
		
		obj.PrintTables(10);
		
		obj.Sum(obj, 1234);
	}
}
