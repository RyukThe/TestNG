package KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3
{
	@Test(priority = 54)
	public void TC1()
	{
		Reporter.log("Running TC1",true);
		
	}
	
	@Test (invocationCount = 5)
	public void TC2()
	{
		
		Reporter.log("Running TC2",true);
		
	}
	@Test(enabled = false)
	public void TC3()
	{
		Reporter.log("Running Tc3",true);
	}
	@Test(priority = 5)
	public void TC4()
	{
		Reporter.log("Running Tc4",true);
	}
	@Test(priority = 7)
	public void TC7()
	{
		Reporter.log("Running Tc3",true);
	}
	@Test(enabled = false)
	public void TC5()
	{
		Reporter.log("Running Tc5",true);
	}
	@Test(enabled = false)
	public void TC8()
	{
		Reporter.log("Running Tc8",true);
	}
	@Test(enabled = false)
	public void TC9()
	{
		Reporter.log("Running Tc9",true);
	}
	@Test(priority = 5,invocationCount = 5)
	public void TC10()
	{
		Reporter.log("Running Tc10",true);
	}
	
	@Test(priority = 2,invocationCount = 5)
	public void TC12()
	{
		Reporter.log("Running Tc12",true);
	}
	@Test
	public void TC13()
	{
		Reporter.log("Running Tc13",true);
	}
	
	

}
