

package agile;
import org.joda.time.DateTime;

/**Entry point of application.**/
public class Application{

	public static void main(String[] args)
	{
		System.out.println("Hello world !!!");
		DateTime date = DateTime.now();
		System.out.println(date);
		
	}
	
	/** 
	 * Add methode with 2 parameter.
	 * @param i int
	 * @param j int
	 * @return int
	 */
	public static int add(int i, int j) {
		return i + j;
	}

}