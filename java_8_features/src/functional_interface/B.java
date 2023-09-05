package functional_interface;

public class B implements A {

	public static void main(String[] args)
	{
		B b=new B();
		b.test1();
		b.test2();
		b.test3();
		
	}

	@Override
	public void test1()  
	{
		System.out.println(800);
	
		
	}

}
