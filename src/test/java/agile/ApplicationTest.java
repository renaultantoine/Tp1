package agile;

import static org.junit.Assert.fail;

import org.junit.Test;

import agile.Application;
import junit.framework.Assert;

public class ApplicationTest {

	@Test
	public void testAdd() {
		int entierUn = 2;
		int entierDeux = 3;
		int entierResult = Application.addFunctionCalculator(entierUn, entierDeux);

		Assert.assertEquals("Add not good", entierResult, 5);
	}
}
 
