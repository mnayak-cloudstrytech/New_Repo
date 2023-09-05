package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

	public static void main(String[] args) {
		List <Integer>list=new ArrayList<Integer>();
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(8);
		list.add(30);
		list.add(40);
		list.add(15);
		list.add(35);
		list.add(100);
		System.out.println(list);
		
		List<Integer> newList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		System.out.println(newList);

	}

}
