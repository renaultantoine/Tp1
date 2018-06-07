

package agile;
import org.joda.time.DateTime;

/**Entry point of application.**/
public class Application{

	/**
	 * Methode main 
	 * @param args tab of args
	 */
	public static void main(final String[] args)
	{
		System.out.println("Hello world !!!");
		final DateTime date = DateTime.now();
		System.out.println(date);
		
	}
	
	/** 
	 * Add methode with 2 parameter.
	 * @param i int
	 * @param j int
	 * @return int
	 */
	public static int addFunctionCalculator(final int i, final int j) {
		return i + j;
	}

}