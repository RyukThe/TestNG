package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertFalse
{
	@Test
	public void m1()
	{
		boolean con=true;
		Assert.assertFalse(con,"Fail : expected false but get true");
	}

}
