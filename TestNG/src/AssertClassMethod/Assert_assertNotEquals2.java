package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assert_assertNotEquals2 
{
	@Test
	public void Tc1()
	{
		String actResult="My NAme Ok ";
		String expResult="hkk";
		Assert.assertNotEquals(actResult, expResult,"Fail: Both result are same :");

	}

}
