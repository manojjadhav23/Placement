package com.demo.thread;

import com.demo.beans.SearchData;

public class SearchThread extends Thread{
	 private SearchData sdata;
	 private String wrd;
	public SearchThread(SearchData sdata, String wrd) {
		super();
		this.sdata = sdata;
		this.wrd = wrd;
	}

	public SearchThread() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		 boolean status=sdata.Search("read.txt", wrd);
		 if(status) {
			 System.out.println("word is found: "+wrd);
		 }
		 
		 else {
			 System.out.println("word is not found: "+wrd);
		 }
	 }
	 

}
