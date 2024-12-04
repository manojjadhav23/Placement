package com.demo.beans;

public class Storage {
	private int n;
	private boolean value; 
	
	public Storage() {
		super();
		value=false;
	}
	
	synchronized public void set(int x) {
		if(value) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("In put"+x);
		n=x;
		value=true;
		notify();
	}
	synchronized public void get() {
		if(!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("In get:"+n);
		value=false;
		notify();
	}
}

