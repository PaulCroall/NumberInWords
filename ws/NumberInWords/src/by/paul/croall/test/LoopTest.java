package by.paul.croall.test;

import org.junit.Assert;
import org.junit.Test;

import by.paul.croall.Number;


public class LoopTest {

	/**
	 * Tests example numbers on a doubling range.
	 */
	@Test
	public void loopTest()
	{		
		Number number = new Number();
		
		for( int i=1 ; i<1000000000 ; i *= 2 )
		{
			String answer = number.getAsWords( i );
			
			switch( i )
			{
				case 1:Assert.assertEquals( "one", answer );
						break;
				case 1024:Assert.assertEquals( "one thousand and twenty four", answer );
						break;
				case 1048576:Assert.assertEquals( "one million forty eight thousand five hundred and seventy six", answer );
						break;
				case 268435456:Assert.assertEquals( "two hundred and sixty eight million four hundred and thirty five thousand four hundred and fifty six", answer );
				default:
			}
		}
	}	
}