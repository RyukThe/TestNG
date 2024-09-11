package KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class13 
{
	@Test(invocationCount = 5)
	public void kl()
	{
		Reporter.log("K1 Running ",true);
	}
	
	
	@Test(priority = 5)
	public void TC1()
	{
		Reporter.log("TC1 is running ",true);
		
	}
	
	
	@Test(enabled = false)
	public void tc2()
	{
		Reporter.log("Tc2 is running ",true);
	}

}
