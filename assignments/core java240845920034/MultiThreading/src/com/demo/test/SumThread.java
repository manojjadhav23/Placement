package com.demo.test;

import com.demo.beans.MyClass;

public class SumThread implements Runnable {
	private MyClass ob;
	private int n;
	
	public SumThread(MyClass ob, int n) {
		this.ob=ob;
		this.n=n;
	}

	@Override
	public void run() {
		ob.Sum(ob,n);
		
	}

}
