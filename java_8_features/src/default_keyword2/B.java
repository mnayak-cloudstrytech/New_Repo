package default_keyword2;

public class B implements A{
	
	@Override
	public void test1()
	{
		System.out.println(500);
	}

	public static void main(String[] args) {
		
		B b=new B();
		b.test1();
	}

}
