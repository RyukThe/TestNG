package AssertClassMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertTrue4 
{
	@Test()
	public void tc1()
	{
		boolean k= false;
		Assert.assertTrue(k,"Fail : expected true but get false");
	}

}
