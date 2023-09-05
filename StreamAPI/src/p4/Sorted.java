package p4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		List <Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(8);
		list.add(30);
		list.add(40);
		list.add(15);
		list.add(35);
		list.add(100);
		
		System.out.println(list);
		
		List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);

	}

}
