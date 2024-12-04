package stringarraylist;

import java.util.ArrayList;
import java.util.List;

public class TestStringArrayList {
	public static void main(String[] args) {
//		List<Integer> li=new ArrayList<>();
//		li.add(13);
//		li.add(34);
//		li.add(13);
//		li.add(32);
//		System.out.println("finding index position:"+li.indexOf(32));
//			System.out.println("contains:"+li.contains(25));
			
			List<Integer> lii=List.of(12,23,34,45,56,7,78,4);
			lii.stream().forEach(System.out::println);
			System.out.println("finding index position:"+lii.indexOf(23));
			System.out.println("contains:"+lii.contains(34));
			System.out.println("contains:"+lii.contains(444));
			
		
		
	}

}
