package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertNotEquals5 
{
	@Test(timeOut=3000)
	public void m1()
	{
		String s1="HI";
		String S2="HI";
		Assert.assertNotEquals(s1, s1,"fail: both result is same :|");
	}

}
