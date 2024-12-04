package com.demo.test;

import com.demo.beans.Storage;
import com.demo.thread.ConsumerThread;
import com.demo.thread.ProducerThread;

public class TestStorage {

	public static void main(String[] args) {
		Storage s=new Storage();
		ProducerThread pt = new ProducerThread(s);
		ConsumerThread ct=new ConsumerThread(s);
		
		pt.start();
		ct.start();
	}

}
