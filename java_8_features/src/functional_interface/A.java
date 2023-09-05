package functional_interface;

@FunctionalInterface
public interface A {
	
	public void test1();
   // public void test2(); //we can not use two incomplete method or abstract method in a functional interface
     default  void test2()
    {
    	System.out.println(600);
    }
	 default void test3()      //we can create multiple complete method in functional interface using default keyword 
	 {
		 System.out.println(700);
	 }
	
}
