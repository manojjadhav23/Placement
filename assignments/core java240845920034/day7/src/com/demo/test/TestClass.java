package com.demo.test;

import com.demo.beans.FunctionInterface1;
import com.demo.beans.FunctionInterface2;

public class TestClass {
	public static void main(String[] Args) {
				FunctionInterface1 f1=(a,b)->{
					
					return a>b?a:b;
				};
				
			int obj=f1.findMax(23, 65);
				System.out.println("max number is:"+obj);
				
				
				
				
				FunctionInterface2 f2=(s,p)->{
					return s.length()>p.length()?s:p;
				};
				
				System.out.println("max string is:"+f2.findMax("manoj","jadhav"));
	
	
	
	
	
	
	}
	
	

}
