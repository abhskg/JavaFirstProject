package com.sapient.shapes;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int calculateArea() {
		return this.side * this.side;
	}

}
