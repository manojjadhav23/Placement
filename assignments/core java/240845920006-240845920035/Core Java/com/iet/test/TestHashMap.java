package com.iet.test;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class TestHashMap {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		hm.put("DSA",1);
		hm.put("WBT",2);
		hm.put("java",3);
		
		System.out.println(hm);
		
		Collection<String>ks=hm.keySet();
		
		for(String t:ks)
		{
			System.out.println(t+"-----"+hm.get(t));
		}
		
		System.out.println("--------------------*************-------------------");
			Set<Map.Entry<String,Integer>> es=hm.entrySet();
			for(Map.Entry<String,Integer> t:es)
			{
				System.out.println(t.getKey()+"------>"+t.getValue());
			}
		
			System.out.println("--------------------*************-------------------");
			 System.out.println("DAC students  "+hm.get("DSA"));
			 System.out.println("Java students  "+hm.get("java"));
			 
				System.out.println("--------------------*************-------------------");
		
				  System.out.println("check key exists DBDA : "+hm.containsKey("DBDA"));
				    if(!hm.containsKey("DBDA"))
				    	hm.put("DBDA", 100);
				    else 
				    	System.out.println("Duplicate key");
				    
				    System.out.println(hm);
				    hm.remove("DBDA");

					System.out.println("--------------------*************-------------------"); 
				    System.out.println(hm);
	}

}
