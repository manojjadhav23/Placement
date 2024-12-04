package com.demo.test;


import com.demo.beans.SearchData;
import com.demo.thread.SearchThread;

public class TestSearch {

	public static void main(String[] args) {
		String[] strarr= {"rohit","rajesh","nikhil","Harsh"};
		SearchThread[] st=new SearchThread[strarr.length];
		SearchData sdata = new SearchData();
		for(int i=0;i<strarr.length;i++) {
			System.out.println("Searching.."+strarr[i]);
			st[i]=new SearchThread(sdata, strarr[i]);
			st[i].start();
		}
		
		for(int i=0;i<strarr.length;i++) {
			try {
				st[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
