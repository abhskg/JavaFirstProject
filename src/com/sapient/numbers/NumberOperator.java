package com.sapient.numbers;

import java.util.Scanner;

public class NumberOperator {

	public static void main(String[] args) {
		Command_Line1 cl1 = new Command_Line1(args);

		System.out.println(cl1);
		cl1.calData();
		System.out.println(cl1);

		System.out.println("Enter the count for numbers : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		KeyRead_Line2 kl2 = new KeyRead_Line2(num);

		sc.close();
	}

}
