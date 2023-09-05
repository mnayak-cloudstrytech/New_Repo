package staticNonstatic;

public class A {
	int x = 20; //non static variable
	int y = 30;
	

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
	}

}
