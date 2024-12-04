package com.demo.thread;

import com.demo.beans.Storage;

public class ConsumerThread extends Thread{
	private Storage s;
	
	public  ConsumerThread(Storage s) {
		super();
		this.s=s;
	}
	
	public void run() {
		for(int i=1;i<10;i++) {
			s.get();
		}
	}
}
