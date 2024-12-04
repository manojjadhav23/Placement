package com.iet.bean;

public class Course {

	private String name;
	private Double fees;
	private int capacity;
	private int duration;
	public Course() {
		super();
	}
	public Course(String name, Double fees, int capacity, int duration) {
		super();
		this.name = name;
		this.fees = fees;
		this.capacity = capacity;
		this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", fees=" + fees + ", capacity=" + capacity + ", duration=" + duration + "]";
	}

	
}
