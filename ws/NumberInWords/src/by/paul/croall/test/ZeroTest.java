/**
 * 
 */
package by.paul.croall.test;

import org.junit.Assert;
import org.junit.Test;

import by.paul.croall.Number;


public class ZeroTest {

	/**
	 * Tests whether zero works
	 */
	@Test
	public void zeroTest()
	{
		Number number = new Number();
		
		String answer = number.getAsWords( 0 );
		
		Assert.assertEquals( "zero", answer );
	}
}
