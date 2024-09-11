package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertFalse_ 
{
	@Test
	public void tc1()
	{
		String actR="hi";
		String expr="hier";
		Assert.assertEquals(actR, expr);
		boolean atcresult=true;
		Assert.assertFalse(atcresult,"Fail: expected false but actual result is true :");
	}

}
