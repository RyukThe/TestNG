package KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class8
{
	@Test(invocationCount = 5)
	public void TC1()
	{
		Reporter.log("TC1",true);
	}
	
	
	@Test(enabled = false)
	public void TC3()
	{
		Reporter.log("TC3",true);
	}
	
	
	@Test(priority = 1)
	public void tc2()
	{
		Reporter.log("Tc2",true);
	}
	
	@Test(priority = -1,invocationCount = 5)
	public void tc10()
	{
		Reporter.log("tc10",true);
	}

}
