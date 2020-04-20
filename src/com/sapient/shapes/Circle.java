package com.sapient.shapes;

public class Circle {

	private int radius;
	private int area;

	public Circle(int side) {
		this.radius = side;
	}

	public int calculateArea() {
		this.area = (int) (3.14 * this.radius * this.radius);
		return this.area;
	}

}
