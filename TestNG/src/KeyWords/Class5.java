package KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class5
{
	
	@Test(priority = 11,invocationCount = 3)
	public void TC3()
	{
		Reporter.log("Running Tc3",true);
	}
	
	@Test(priority = -5)
	public void TC1()
	{
		Reporter.log("Running Tc1",true);
	}
	
	@Test(invocationCount = 4)
	public void TC2()
	{
		Reporter.log("Running Tc2",true);
	}
	
	@Test(priority = 1 )
	public void TC4()
	{
		Reporter.log("Running Tc4",true);
	}
	@Test(enabled = false)
	public void TC5()
	{
		Reporter.log("Running Tc6",true);
	}
}
