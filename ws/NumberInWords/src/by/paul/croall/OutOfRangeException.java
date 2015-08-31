package by.paul.croall;

public class OutOfRangeException extends RuntimeException
{
	/**
	 * Serial version unique identifier
	 */
	private static final long serialVersionUID = -7076052358354709374L;

	/**
	 * Constructs the exception, with the critical range information
	 * 
	 * @param min
	 * @param actual number which ought to be but isn't between min & max
	 * @param max
	 */
	public OutOfRangeException( int min, int actual, int max )
	{
		super( "Out of range, required that " + min  + " <= " + actual + " <= " + max );
	}
}
