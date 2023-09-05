package p3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ab {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		 list.add(5);
		  list.add(8);
		  list.add(2);
		  list.add(7);
		  list.add(6);
		  list.add(3);
		  list.add(10);
		  list.add(1);
		  
		  System.out.println(list);
		  List<Integer> list2 = list.stream().map(x->x*x).collect(Collectors.toList());
		  
		  System.out.println(list2);

	}

}
