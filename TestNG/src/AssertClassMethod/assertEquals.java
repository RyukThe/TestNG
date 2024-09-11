package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals
{
	@Test
	public void tc1()
	{
		String s="Hi";
		String S2="Hello";
		
		Assert.assertEquals(s, S2);
		
	}

}
