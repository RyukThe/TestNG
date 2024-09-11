package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assert_assertNotEquals7 
{
	@Test
	public void Tc1()
	{
		String actResult="hi";
		String expResult="hkk";
		Assert.assertNotEquals(actResult, expResult,"Fail: Both result are same :");

	}

}
