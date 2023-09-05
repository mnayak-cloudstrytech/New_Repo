package staticNonstatic;

public class E {
	 static int x = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(E.x);
		E.x= 500;
		System.out.println(E.x);

	}

}
