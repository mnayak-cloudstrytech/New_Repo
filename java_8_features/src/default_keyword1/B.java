package default_keyword1;

public class B implements A{

	public static void main(String[] args) 
	{
		B b=new B();
		 
		b.test1();
		b.test2();
		
	}

	@Override
	public void test2() {
		System.out.println(300);
		
	}

}
