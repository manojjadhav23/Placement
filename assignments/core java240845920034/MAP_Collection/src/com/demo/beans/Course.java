package com.demo.beans;

public class Course {
	private String cname;
	private double fee;
	private int capacity;
	private int duration;
	public Course() {
		super();
	}
	public Course(String cname, double fee, int capacity, int duration) {
		super();
		this.cname = cname;
		this.fee = fee;
		this.capacity = capacity;
		this.duration = duration;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
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
		return "Course [cname=" + cname + ", fee=" + fee + ", capacity=" + capacity + ", duration=" + duration + "]";
	}
	
	
	
}
