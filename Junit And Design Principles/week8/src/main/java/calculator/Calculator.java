package calculator;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		Operator operator;
		int num1, num2, ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice: \n1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Division\n\n ");
		ch = scan.nextInt();

		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter Second Number: ");
		num2 = scan.nextInt();
			
		
		switch (ch) {
		case 1:
			operator = new Addition();	
			break;
		case 2:
			operator = new Subtraction();	
			break;
		case 3:
			operator = new Multiplication();	
			break;
		case 4:
			operator = new Division();	
			break;
		default:
			operator = new Addition(); 
			break;
		}
		
		int result = operator.calculate(num1, num2);
		System.out.println("Result : " + result);
		scan.close();
	}

}
