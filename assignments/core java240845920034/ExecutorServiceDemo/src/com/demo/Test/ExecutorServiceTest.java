package com.demo.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.demo.beans.MyTask;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		List<Future<Integer>> lst = new ArrayList<>();
		
		for(int i=0;i<91;i=i+10) {
			Future<Integer> fs =es.submit(new MyTask(i,i+9));
			lst.add(fs);
	}
		int sum=0;
		for(Future<Integer> fs1:lst) {
			try {
				sum=sum+fs1.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Sum is:"+sum);
		es.shutdown();

	
}
}
