package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertNotEquals9 
{
	@Test
	public void Tc1()
	{
		String actr="Hello";
		String expect="Hello";
		Assert.assertNotEquals(actr, expect,"Fail: both result is same ");
	}

}
