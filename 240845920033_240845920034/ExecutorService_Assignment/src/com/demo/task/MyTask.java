package com.demo.task;

import java.util.concurrent.Callable;

import com.demo.search.SearchData;

public class MyTask implements Callable<String> {
	
	private int start;
	private int end;
	private SearchData sdata;
	 private String wrd;
		public MyTask(SearchData sdata, String wrd) {
			super();
			this.sdata = sdata;
			this.wrd = wrd;
			
		}
		public MyTask(int start,int end) {
			this.start=start;
			this.end=end;
		}


	@Override
	public String call() throws Exception {
		boolean status = false;
		for(int i=start;i<end;i++) {
			status=sdata.search("Name.txt", wrd);
		}
		 if(status) {
			 System.out.println("word is found: "+wrd);
		 }
		 
		 else {
			 System.out.println("word is not found: "+wrd);
		 }
		return wrd;
		
	}
	

}
