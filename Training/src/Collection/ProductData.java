package Collection;

import java.util.*;
public class ProductData {
	private List<Product> prdlist;
	private Scanner sc;
	public ProductData()
	{
		prdlist=new ArrayList<Product>();
		sc=new Scanner(System.in);
	}
	public void insertData()
	{
		System.out.println("Enter how many product u want to accept");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++)
		{
			Product p=new Product();
			System.out.println("Enter Product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter Product name ");
			p.setProductname(sc.next());
			System.out.println("Enter Price ");
			p.setPrice(sc.nextDouble());
			System.out.println("Enter quantity");
			p.setQuantity(sc.nextInt());
			prdlist.add(p);
		}
		
	}
	public void display()
	{
		for(Product p:prdlist)
		{
			System.out.println("Product id is "+p.getProductid());
			System.out.println("Name is "+p.getProductname());
		}
	
	}


}