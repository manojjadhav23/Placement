package com.iet.test;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.SortedSet;

public class TestBackedCollection {

	public static void main(String[] args) {
		TreeSet<Integer>ob=new TreeSet<>();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(5);
		ob.add(6);
		
		System.out.println(ob);
		
		SortedSet<Integer>hs=ob.headSet(4);
		System.out.println(hs);
		
		System.out.println("--------------------*************-------------------");
		
		
		SortedSet<Integer>hd=ob.tailSet(4);
		System.out.println(hd);

		System.out.println("--------------------*************-------------------");
		
		ob.add(12);
		ob.add(0);
		ob.add(15);
		ob.add(1);
		
		System.out.println(hs);
		System.out.println(hd);
	}

}
