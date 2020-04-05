package com.sapient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CheckEvenTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CheckEvenTest( String testName )
    {
        super( testName );
    }


	
    public void twentyTwo() throws Exception {
        boolean result = new CheckEven(22);
        assertThat(result, true);
    }
	
	
	
    public void thirtyNine() throws Exception {
        boolean result = new CheckEven(39);
        assertThat(result, false);
    }
	
	
	
    public void twelve() throws Exception {
        boolean result = new CheckEven(12);
        assertThat(result, true);
    }
	
	
	
    public void thirtyTwo() throws Exception {
        boolean result = new CheckEven(32);
        assertThat(result, true);
    }
	

    /**
     * @return the suite of tests being tested
     
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }*/

    /**
     * Rigourous Test :-)
     
    public void testApp()
    {
        assertTrue( true );
    }*/
}
