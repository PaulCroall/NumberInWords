package by.paul.croall;

public class Number implements IGetAsWords
{
	/**
	 * Constructs a Number object
	 */
	public Number()
	{	
		hi = new HunTenUnits( MILLION );
		mid = new HunTenUnits( THOUSAND );
		lo = new HunTenUnits();
	}

	private final static String MILLION = "million ";
	private final static String THOUSAND = "thousand ";

	private final static String ZERO = "zero";
	
	private final static String AND = "and ";
	
	private HunTenUnits hi, mid, lo;
	
	/**
	 * From the IGetAsWords interface.
	 * 
	 * Returns the parameter in words
	 * 
	 * @param no in range of 0 to 999999999
	 */
	public String getAsWords( int no )
	{
		verifyRange( 0, no, 999999999 );
		
		if ( no == 0 )
			return( ZERO );
		
		String leftAnd = "", rightAnd = "";

		String hiStr = hi.getAsWords( no / 1000000 );
		String midStr = mid.getAsWords( ( no / 1000 ) % 1000 );
		String loStr = lo.getAsWords( no % 1000 );
		
		if ( ( hiStr != null || midStr != null ) && loStr != null && no % 1000 < 100 )
			rightAnd = AND;
		else
			if ( hiStr != null && ( midStr != null || loStr != null ) && ( no / 1000 ) % 1000 < 100 && no % 1000 < 100 )
				leftAnd = AND;
			
		hiStr = hi.nullsToBlank( hiStr );
		midStr = mid.nullsToBlank( midStr );
		loStr = lo.nullsToBlank( loStr );
		
		return( trim( hiStr + leftAnd + midStr + rightAnd + loStr ) );
	}
	
	/**
	 * Verifies an actual number, ensuring it is between min & max,
	 * throwing an OutOfRangeException when appropriate
	 * 
	 * @param min
	 * @param actual
	 * @param max
	 */
	private void verifyRange( int min, int actual, int max )
	{
		if ( min > actual || actual > max )
			throw new OutOfRangeException( min, actual, max );
	}
	
	/**
	 * Trims the space off the right end of the String passed in,
	 * if such a space is present, otherwise returns the String untouched.
	 * 
	 * @param str
	 * @return
	 */
	private String trim( String str )
	{
		int len;
		
		if ( str!=null && (len=str.length()) > 0 && str.charAt( --len ) == ' ' )
			str = str.substring( 0, len );
		
		return( str );
	}
}
