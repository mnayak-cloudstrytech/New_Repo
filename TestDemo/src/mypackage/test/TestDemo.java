package mypackage.test;

import static org.junit.Assert.*;

import org.junit.Test;
public class TestDemo {
	@Test
	public void test_demo() {
	
		System.out.println("Welcome To Junit");
		String s1="Welcome to first test ";
		assertEquals("Welcome to first test case",s1);
		
	}

}