package org.ccb.sonarcube.math;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldAdd() {
		Calculator calc = new Calculator();
		double result = calc.add(1.0, 5.0);
		org.junit.Assert.assertEquals(6.0, result,2);
	}
}
