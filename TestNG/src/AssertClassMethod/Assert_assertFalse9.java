package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertFalse9
{
	@Test
	public void m1()
	{
		boolean con=true;
		Assert.assertFalse(con,"Fail : expected false but get true");
	}

}
