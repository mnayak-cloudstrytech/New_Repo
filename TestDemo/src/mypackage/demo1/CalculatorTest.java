package mypackage.demo1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void add() {
		Calculator c=new Calculator();
		int result=c.add(5,3);
		assertEquals(8,result);
	}
	@Test
	public void sub() {
		Calculator c=new Calculator();
		int result=c.sub(5,3);
		assertEquals(2,result);
	}

}
