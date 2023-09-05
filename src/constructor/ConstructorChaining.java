package constructor;

public class ConstructorChaining
{
	ConstructorChaining()
	{
	  System.out.println(1);	
	}
	ConstructorChaining(int x)
	{
	 	this();
	}
	ConstructorChaining(int x,int y)
	{
		this(100);
	}

	public static void main(String[] args) 
	{
		ConstructorChaining c = new ConstructorChaining(100,200);
		
	}

}
