package mypackage.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mypackage.demo.Greeting;

public class GreetingTest {
	Greeting g;

	@Before
	public void setUp() {
		g=new Greeting();
	}
    @Test
    public void testBirthdaymessage() {
    	String s1="Happy Birthday";
    	assertEquals(g.getBirthdayMessage(),s1);
    }
    @Test
    public void testGoodMorningmessage() {
    	String s2="Good Morning Everyone";
    	assertEquals(g.getBirthdayMessage(),s2);
    }
    @Test
    public void testResult() {
    	assertTrue(g.result());
    }
}
