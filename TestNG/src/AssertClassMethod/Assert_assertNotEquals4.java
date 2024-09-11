package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertNotEquals4
{
	@Test(invocationCount=4)
	public void Tc1()
	{
		String actR= "OK Google";
		String expR="Ok SIRI";
		Assert.assertNotEquals(actR, expR,"Fail: both resul is same");
	}

}
