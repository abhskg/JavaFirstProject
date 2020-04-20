package com.sapient.shapes;

public class Shapes {

	public int calculateShapeArea(int numberOfSides, int side) {
		if (numberOfSides == 1) {
			Circle C = new Circle(side);
			return C.calculateArea();
		} else if (numberOfSides == 3) {
			Triangle T = new Triangle(side);
			return T.calculateArea();
		} else if (numberOfSides == 4) {
			Square S = new Square(side);
			return S.calculateArea();
		} else {
			System.out.println("No Shapes Present");
		}
		return 0;
	}

	public static void main(String[] args) {
		Shapes S = new Shapes();
		System.out.println(S.calculateShapeArea(3, 5));
		System.out.println(S.calculateShapeArea(4, 6));
		System.out.println(S.calculateShapeArea(1, 3));
		System.out.println(S.calculateShapeArea(2, 5));
		System.out.println(S.calculateShapeArea(3, 2));
		System.out.println(S.calculateShapeArea(2, 5));
		System.out.println(S.calculateShapeArea(1, 5));
		System.out.println(S.calculateShapeArea(4, 4));


	}
}
