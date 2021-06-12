package org.ccb.sonarcube.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void shouldAdd() {
		Calculator calc = new Calculator();
		double result = calc.add(1, 5);
		Assertions.assertEquals(6.0, result);
	}
}
