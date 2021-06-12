package org.ccb.sonarcube.math;

public class Calculator {

	public double add(double param1, double param2) {
		return param1 + param2;
	}
	
	public double substruct(double param1, double param2) {
		return param1 - param2;
	}
	
	public double multiply(double param1, double param2) {
		return param1 * param2;
	}
	
	public double divide(double param1, double param2) {
		if (param2 == 0 ) {
			throw new IllegalArgumentException("Can not divide to zero.");
		}
		return param1 / param2;
	}
}
