package com.demo.thread;

import com.demo.beans.Storage;

public class ProducerThread extends Thread{
	private Storage s;
	
	public ProducerThread(Storage s) {
		this.s=s;
	}
	
	public void run() {
		for(int i=1;i<10;i++) {
			s.set(i);
		}
		
	}
}
