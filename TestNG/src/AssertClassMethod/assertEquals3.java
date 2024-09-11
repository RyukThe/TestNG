package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals3
{
	@Test
	public void tc1()
	{
		String actR="OK ";
		String expct="ok";
		Assert.assertEquals(actR, expct,"Fail: Both result are not same :");
	}

}
