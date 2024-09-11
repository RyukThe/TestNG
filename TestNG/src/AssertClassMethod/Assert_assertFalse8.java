package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertFalse8 
{
	@Test
	public void tc1()
	{
		boolean l=true;
		Assert.assertFalse(l,"fail: Expected false but fount true");
	}

}
