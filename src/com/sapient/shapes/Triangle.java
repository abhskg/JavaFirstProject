package com.sapient.shapes;

public class Triangle {

	private int side;

	public Triangle(int side) {
		this.side = side;
	}

	public int calculateArea() {
		return (int) (0.433 * this.side * this.side);
	}

}
