package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		List<Integer> lst = List.of(25,10,30,40);
		List<Integer> lst1=lst.stream().filter(num->num%2==0).collect(Collectors.toList());
		Optional<Integer> op=lst.stream().filter(num->num%2==0).findAny();
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("Not found");
		}
		lst1.stream().forEach(System.out::println);
		
		System.out.println("All Match:"+lst.stream().allMatch(num->num%4==0));

		System.out.println("Any Match:"+lst.stream().anyMatch(num->num%4==0));

		System.out.println("None Match:"+lst.stream().noneMatch(num->num%4==0));
	}

}
