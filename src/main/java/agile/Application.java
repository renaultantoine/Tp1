package agile;
import org.joda.time.DateTime;

public class Application{
	public static void main(String[] args)
	{
		System.out.println("Hello world !!!");
		DateTime date = DateTime.now();
		System.out.println(date);
		
	}
	
	public static int add(int i, int j) {
		return i + j;
	}

}