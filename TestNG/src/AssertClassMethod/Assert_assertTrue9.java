package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertTrue9
{
	@Test
	public void s1()
	{
		boolean r=true;
		Assert.assertTrue(r,"Fail : expected true but get false");
	}

}
