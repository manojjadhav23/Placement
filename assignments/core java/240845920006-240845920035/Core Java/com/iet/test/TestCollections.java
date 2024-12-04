package com.iet.test;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestCollections {

	public static void main(String[] args) {
	
	List<Integer>lis = List.of(1,2,3,4,5,6);
	
	System.out.println("maximum of list is :-  "+Collections.max(lis));

	System.out.println("minimum of list is :-  "+Collections.min(lis));
	
	List<Integer> list1=new ArrayList<>();	
	for(Integer i:lis)
	{
		
	
	
	list1.add(i);
	}
	
	for(int i=0;i<6;i++)
	{
		Collections.shuffle(list1);
		System.out.println(" after shuffling ");
		System.out.println(list1);
	}
	
	}

}
