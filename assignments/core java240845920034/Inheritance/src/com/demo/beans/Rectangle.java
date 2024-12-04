package com.demo.beans;

public class Rectangle extends Shape{
	private float length,breath;

	public Rectangle() {
		super();
	}

	public Rectangle(float length, float breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreath() {
		return breath;
	}

	public void setBreath(float breath) {
		this.breath = breath;
	}
	
	public float calArea() {
		return length*breath;
	}
	
	public float calPerimeter() {
		return 2*(length+breath);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}
	
}
