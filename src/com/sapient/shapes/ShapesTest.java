package com.sapient.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShapesTest {

	@Test
	void test1() {
		Shapes shape = new Shapes();
		int t1 = shape.calculateShapeArea(3, 12);
		assertEquals(62, t1);
	}

	@Test
	void test2() {
		Shapes shape = new Shapes();
		int t2 = shape.calculateShapeArea(4, 15);
		assertEquals(225, t2);
	}

	@Test
	void test3() {
		Shapes shape = new Shapes();
		int t3 = shape.calculateShapeArea(5, 15);
		assertEquals(0, t3);
	}

//	@Test
//	void test4() {
//		Shapes shape = new Shapes();
//		int t1 = shape.calculateShapeArea(1, 7);
//		assertEquals(22,t1);		
//	}

}
