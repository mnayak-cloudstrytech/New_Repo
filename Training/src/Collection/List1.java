package Collection;
import java.util.*;
public class List1 {
	private List<String> liststr;
	public List1()
	{
		liststr=new ArrayList<String>();
	}
	public void op()
	{
		liststr.add("Milan");
		liststr.add("Subham");
		liststr.add("Rinku");
		liststr.add("Soumya");
		liststr.add("Titun");
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