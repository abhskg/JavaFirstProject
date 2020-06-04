package number;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

	private Number number ;
	
	@Before 
	public void setUp () {
		number = new Number ();
	}
	

	@Test
	public void checkPrimeNumberForTwo() {
		boolean result = number.checkPrime(2);
		assertEquals(true, result);
	}

	@Test
	public void checkPrimeNumberForEleven() {
		boolean result = number.checkPrime(11);
		assertEquals(true, result);
	}
	
	@Test
	public void checkPrimeNumberForOneHundredThirtyOne() {
		boolean result = number.checkPrime(131);
		assertEquals(true, result);
	}
	
	@Test
	public void checkPrimeNumberForTwentyFourFAIL() {
		boolean result = number.checkPrime(24);
		assertEquals(false, result);
	}
	
	@Test
	public void checkArmstrongNumberForHundredFivtyThree() {
		boolean result = number.checkArmstrong(153);
		assertEquals(true, result);
	}

	@Test
	public void checkArmstrongNumberForHundredAndThreeFAIL() {
		boolean result = number.checkArmstrong(103);
		assertEquals(false, result);
	}
	
	@Test
	public void checkPalindromeNumber() {
		boolean result = number.checkPalindrome(131);
		assertEquals(true, result);
	}

	@Test
	public void checkPalindromeNumberTwentyFourFAIL() {
		boolean result = number.checkPalindrome(24);
		assertEquals(false, result);
	}

	
}
