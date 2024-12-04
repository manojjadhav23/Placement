package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(10);
		List<Future<Integer>> lst = new ArrayList<>();
		
		for(int i=0;i<10;i=i+10) {
			@SuppressWarnings("unchecked")
			Future<Integer> fs=(Future<Integer>) es.submit(MyTask());
			lst.add(fs);
	}
		int sum=0;
		for(Future<Integer> fs1:lst) {
			try {
				sum=sum+fs1.get();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} catch (ExecutionException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Sum is:"+sum);
		es.shutdown();
	}

	private static Runnable MyTask() {
		// TODO Auto-generated method stub
		return null;
	}
}
