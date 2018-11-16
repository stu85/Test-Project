package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
	
	Calculator calculator = new Calculator();
	
	@Test
	void addTest() {	
		Assert.assertEquals(calculator.addTwoNumbers(1,3), 4);
	}
	
	@Test
	void minusTest() {	
		Assert.assertEquals(calculator.subtractTwoNumbers(8,5), 3);
	}
	
	@Test
	void minusTestNegativeResult() {	
		Assert.assertEquals(calculator.subtractTwoNumbers(8,9), -1);
	}
	
	@Test
	void minusTestZeroResult() {	
		Assert.assertEquals(calculator.subtractTwoNumbers(8,8), 0);
	}	

}
