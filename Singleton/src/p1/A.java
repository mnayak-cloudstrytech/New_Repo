package p1;

final public class A {
	private A(){
		
	}
	static A a1=null;
	public static A getInstance()
	{
		if (a1==null) 
		{
			a1=new A();
		}
		return a1;
	}

}
