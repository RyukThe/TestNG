package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertTrue10
{
	@Test
	public void m1()
	{
		boolean tc1=false;
		Assert.assertTrue(tc1,"Fail : expected true but get false");
	}

}
