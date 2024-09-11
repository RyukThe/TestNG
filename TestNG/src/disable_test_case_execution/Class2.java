package disable_test_case_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 
{
	@Test
	public void m1()
	{
		Reporter.log("Ruuning m1",true);
	}
	
	@Test
	public void tc1()
	{
		Reporter.log("Ruuning Tc1",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("Ruuning Tc2",true);
	}
	@Test
	public void tc3()
	{
		Reporter.log("Ruuning Tc3",true);
	}
}
