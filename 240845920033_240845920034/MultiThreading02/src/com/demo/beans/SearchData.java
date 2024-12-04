package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchData {
	public boolean Search(String file,String wrd) {
		
		try(BufferedReader br=new BufferedReader(new FileReader(file));)
		{
			String s=br.readLine();
			
			while(s!=null) {
			    if(s.equals(wrd))
			    	return true;
			    s=br.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return false;
		
	}
}
