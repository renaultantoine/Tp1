package agile;

import static org.junit.Assert.fail;

import org.junit.Test;

import agile.Application;
import junit.framework.Assert;

public class ApplicationTest {

	@Test
	public void testAdd() {
		int i = 2;
		int j = 3;
		int k = Application.add(i, j);

		Assert.assertEquals("Add not good", k, 5);
	}
}
 
