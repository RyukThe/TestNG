package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals8 
{
	@Test
	public void m1()
	{
		String actR="Hello";
		String expR="Hello";
		Assert.assertEquals(actR, expR,"Fail: both result is not same");
	}

}
