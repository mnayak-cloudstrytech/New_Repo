package junit_examples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {
	
	@Test
	public void test1() {
		System.out.println("from test1");
	}
	
	@Test
	public void test2() {
		System.out.println("from test2");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@After
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
