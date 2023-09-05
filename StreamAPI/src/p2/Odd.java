package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Odd {

	public static void main(String[] args) {
	  List <Integer>list=new ArrayList<Integer>();
	  
	  list.add(13);
	  list.add(5);
	  list.add(8);
	  list.add(2);
	  list.add(7);
	  list.add(6);
	  list.add(3);
	  list.add(10);
	  list.add(1);
	  System.out.println(list);
	  
	       List<Integer>newList=list.stream().filter(x->x%2!=0).collect(Collectors.toList());
		
             System.out.println(newList);
	}

}
