package constructor;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
	System.out.println(10); 
	}
	ConstructorOverloading(int x)
	{
		System.out.println(x);
	}
	ConstructorOverloading(String s)
	{
		System.out.println(s);
	}
	ConstructorOverloading(int x,int y)
	{
	 System.out.println(x+" "+y);	
	}

	public static void main(String[] args) {
		
		ConstructorOverloading c= new ConstructorOverloading();
		ConstructorOverloading c1= new ConstructorOverloading(100);
		ConstructorOverloading c2= new ConstructorOverloading("Milan");
		ConstructorOverloading c3= new ConstructorOverloading(200,300);


	}

}
