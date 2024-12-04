package com.demo.services;

import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shape;
import com.demo.beans.Triangle;

public class ShapeServices {
	static Shape[] sarr;
	static int cnt;
	static {
		sarr = new Shape[5];
		cnt =0;
	}
	public static void AcceptData(int choice) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		switch(choice) {
		case 1:
			System.out.println("Enter Base:");
			float b = sc.nextFloat();
			System.out.println("Enter Height:");
			float h = sc.nextFloat();
			System.out.println("Enter Side1:");
			float s1 = sc.nextFloat();
			System.out.println("Enter Side2:");
			float s2 = sc.nextFloat();
			sarr[cnt]=new Triangle(b,h,s1,s2);
			break;
		case 2:
			System.out.println("Enter Radius:");
			float r=sc.nextFloat();
			sarr[cnt]=new Circle(r);
			break;
		case 3:
			System.out.println("Enter Length:");
			float l = sc.nextFloat();
			System.out.println("Enter Breath:");
			float bh=sc.nextFloat();
			sarr[cnt]=new Rectangle(l,bh);
			break;
		}
		cnt++;
	}
	public static Shape[] getAllShapes() {
		// TODO Auto-generated method stub
		return sarr;
	}
	public static void calculateDetails(int i) {
		// TODO Auto-generated method stub
		System.out.println(i+"Area:"+sarr[i].calArea());
		System.out.println(i+"Perimeter:"+sarr[i].calPerimeter());
		
	}
	
}
