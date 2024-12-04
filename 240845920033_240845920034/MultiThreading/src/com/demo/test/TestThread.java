package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.threads.FactorialThread;
import com.demo.threads.TableThread;

public class TestThread {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		 TableThread th=new TableThread(ob, 7);
		
		FactorialThread th1 = new FactorialThread(ob,5);
		
		TableThread th2=new TableThread(ob, 10);
		
		SumThread sm=new SumThread(ob,123);
		Thread th3 = new Thread(sm);
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
		
		try {
			th.join();
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Method");

	}


}
