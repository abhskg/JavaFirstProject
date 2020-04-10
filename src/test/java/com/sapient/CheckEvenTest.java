package com.sapient;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenTest 
{
	private CheckEven Chk;
    
	@Before
	public void setup() {
		Chk = new CheckEven() ;
	}

	@Test
    public void twentyTwo() {
        boolean result = new Chk.check(22);
        assertTrue(true == result);
    }	
	
	@Test
    public void thirtyNine() {
        boolean result = new Chk.check(39);
        assertTrue(true == result);
    }
	@Test
    public void negaiveTwelve() {
        boolean result = new Chk.check(-12);
        assertTrue(true == result);
    }
	@Test
    public void negativeThirtyTwo() {
        boolean result = new Chk.check(22);
        assertTrue(true == result);
    }	
}
