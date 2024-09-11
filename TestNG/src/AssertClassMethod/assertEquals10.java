package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEquals10 
{
	@Test(invocationCount=4)
	public void Tc1()
	{
		String s1="My Name is Ryuk";
		String s2="Ryuk is my name";
		Assert.assertEquals(s1, s2,"Fail: both result is not Ok");
		
	}

}
