package com.demo.beans;

public class Circle extends Shape {
	private float radius;
	final static float pi =3.14f;

	public Circle() {
		super();
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public float calArea() {
	 return pi*radius*radius;
	}
	
	public float calPerimeter() {
		return 2*pi*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
