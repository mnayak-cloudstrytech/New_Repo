package p2;

public class B {

	public static void main(String[] args) {
		A a1=A.getInstance();
		System.out.println(a1);
		A a3=A.getInstance();
		System.out.println(a3);

	}

}
