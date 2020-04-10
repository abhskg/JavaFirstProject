package com.sapient;

/**
 * Program to check the number is Even or Not 
 **/
public class CheckEven{
	public boolean check(int x)		/* Previously the function isEven*/ 
	{ 
		if(x%2==0) 
			return true; 
		else 
			return false;
	}
	
    /*public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in); 
		System.out.print("Enter an integer number or -1 to stop: ");
		int a= input.nextInt(); 
		while(a!=-1){ 
			if(isEven(a)) 
				System.out.println(a+ " is Even" ); 
			else 
				System.out.println(a+ " is Odd" ); 
			System.out.print("Enter an integer number or -1 to stop: "); 
		a= input.nextInt(); 
		}
	}*/	
}
