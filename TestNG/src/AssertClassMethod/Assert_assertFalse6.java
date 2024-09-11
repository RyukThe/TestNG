package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertFalse6 
{
	@Test
	public void tc1()
	{
		boolean l=false;
		Assert.assertFalse(l,"fail: Expected false but fount true");
	}

}
