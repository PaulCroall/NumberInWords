
package by.paul.croall.test;

import org.junit.Assert;
import org.junit.Test;

import by.paul.croall.Number;


public class GivenExamplesTest {

	/**
	 * Tests all of the given examples
	 */
	@Test
	public void givenExamples()
	{
		Number number = new Number();
		
		String answer = number.getAsWords( 0 );
		Assert.assertEquals( "zero", answer );
		
		answer = number.getAsWords( 1 );
		Assert.assertEquals( "one", answer );
		
		answer = number.getAsWords( 21 );
		Assert.assertEquals( "twenty one", answer );
		
		answer = number.getAsWords( 105 );
		Assert.assertEquals( "one hundred and five", answer );
		
		answer = number.getAsWords( 123 );
		Assert.assertEquals( "one hundred and twenty three", answer );
		
		answer = number.getAsWords( 1005 );
		Assert.assertEquals( "one thousand and five", answer );
		
		answer = number.getAsWords( 1042 );
		Assert.assertEquals( "one thousand and forty two", answer );
		
		answer = number.getAsWords( 1105 );
		Assert.assertEquals( "one thousand one hundred and five", answer );
		
		answer = number.getAsWords( 56945781 );
		Assert.assertEquals( "fifty six million nine hundred and forty five thousand seven hundred and eighty one", answer );
		
		answer = number.getAsWords( 999999999 );
		Assert.assertEquals( "nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", answer );
	}
}

