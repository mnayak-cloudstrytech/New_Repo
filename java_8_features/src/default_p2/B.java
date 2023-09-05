package default_p2;

import default_keyword.A;

public class B implements A
{
	@Override
     public void test1() 
     {
    	 System.out.println(400);
     }
	public static void main(String[] args)
	{
	  B b=new B();
	  b.test1();

	}

}
