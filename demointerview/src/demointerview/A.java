package demointerview;

public class A extends Thread{
	
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + ":"+ Thread.currentThread().getName());
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		A a2 = new A();
		a2.start();
	}

}
