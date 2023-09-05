
package mypackage.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import mypackage.demo.UserValidate;

public class UserValidateTest {
	UserValidate uservalid;
	@Before
	public void setUp()
	{
		uservalid=new UserValidate();
		
	}
	@BeforeClass
	public static void up()
	{
		System.out.println("Testing done before");
		
	}

	@Test
	public void test() {
		assertTrue("Valid user",uservalid.checkUser("admin", "admin"));
	}
	@Test
	public void testShow() {
		System.out.println("Another test");
	}
	@After
	public void tearDown() {
		System.out.println("Testing done");
	}
	@AfterClass
	public static void down() {
		System.out.println("Testing done after class");
	}
	

}