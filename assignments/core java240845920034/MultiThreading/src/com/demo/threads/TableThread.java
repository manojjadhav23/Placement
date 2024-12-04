package com.demo.threads;

import com.demo.beans.MyClass;

public class TableThread extends Thread {
	private MyClass ob;
	private  int n;
	public TableThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}
	
	public void run() {
		ob.PrintTables(n);
	}
}
