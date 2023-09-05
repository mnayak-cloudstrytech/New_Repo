package service;

import java.util.List;

public class UserService {

	public void shop() 
	{
		try
		{
			System.out.println("Enter 1 to BuyById,2 to BuyName");
			int x=this.sc.nextInt();
			if(x==1)
			{
				List<Product>listOfProductById=new ArrayList<~>();
				
				boolean fl=true;
				while(fl)
				{
					Product product=new Product();
					System.out.println("Enter product id :");
					product.setProductId(sc.nextInt());
					listOfProductById.add(product);
					System.out.println("Press 1 For Buy Another Item ,Press 2 For Billing");
					int input=this.sc.nextInt();
					if(input==2) 
					{
						fl=false;
					}
				}
				int totalPrice=this.productDao.buyProductById(listOfProductById);
				System.out.println("Your Gross Amount is "+totalPrice);
				
			}
			else if(x==2)
			{
				List<Product>listOfProductByName=new ArrayList<~>();
				System.out.println("Enter the product you want to buy");
				int y=sc.nextInt();
			}
			
		}
		catch(Exception e)
		{
			
		}
	}

}