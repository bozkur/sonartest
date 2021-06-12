package org.ccb.sonarcube.math;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldAdd() {
		Calculator calc = new Calculator();
		double result = calc.add(1.0, 5.0);
		org.junit.Assert.assertEquals(6.0, result,2);
	}
	
	@Test
	public void shouldDivide() {
		Calculator calc = new Calculator();
		double result = calc.divide(1.0, 5.0);
		org.junit.Assert.assertEquals(0.2, result,2);
	}
}
