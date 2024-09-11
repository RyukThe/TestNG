package KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class7 
{
	@Test(priority = 2)
	public void Tc1()
	{
		Reporter.log("Running Tc1",true);
	}
	@Test(priority = 1)
	public void Tc2()
	{
		Reporter.log("Running Tc2",true);
	}
	@Test()
	public void Tc3()
	{
		Reporter.log("Running Tc3",true);
	}
	@Test(enabled =false)
	public void Tc4()
	{
		Reporter.log("Running Tc4",true);
	}
	@Test(priority = -1,invocationCount = 7)
	public void Tc6()
	{
		Reporter.log("Running Tc6",true);
	}
	@Test(priority = 8,invocationCount = 2)
	public void Tc7()
	{
		Reporter.log("Running Tc7",true);
	}

}
