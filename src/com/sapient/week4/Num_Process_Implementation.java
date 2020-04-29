package com.sapient.week4;

public class Num_Process_Implementation implements Num_Process {
	private int sum, differ, product, quotient;

	@Override
	public void intCal(int a, int b) {
		this.sum = a + b;
		this.differ = a - b;
		this.product = a * b;
		if (b != 0)
			this.quotient = a / b;
		else
			this.quotient = 0;
	}

}
