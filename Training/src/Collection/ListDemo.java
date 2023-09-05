package Collection;

import java.util.*;
public class ListDemo {
	private List<String> liststr;
	public ListDemo()
	{
		liststr=new ArrayList<String>();
	}
	public void op()
	{
		liststr.add("java");
		liststr.add("welcome");
		liststr.add("hello");
		liststr.add("spring Framework");
		liststr.add("Hibernate Framework");
		System.out.println("Displaying data ");
		for(String s:liststr)
		{
			System.out.println("String is "+s);
		}
		liststr.remove(2);
		System.out.println("Displaying values after removing");
		for(String s:liststr)
		{
			System.out.println("After removing "+s);
		}
	}
	public static void main(String[] args) {
		ListDemo listd=new ListDemo();
		listd.op();
	}
}