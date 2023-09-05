package methodReturn;

public class ReturnValue {

	public static void main(String[] args) 
	{
		ReturnValue r= new ReturnValue();
		int val=r.test();
		System.out.println(val);

	}
	public int test()
	{
		System.out.println(300);
		return  200;
	}

}
