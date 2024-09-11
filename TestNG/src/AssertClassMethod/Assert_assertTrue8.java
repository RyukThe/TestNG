package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertTrue8
{
	@Test
	public void tc1()
	{
		boolean actResult=false;
		Assert.assertTrue(actResult,"Fail: condition is false: ");
	}

}
