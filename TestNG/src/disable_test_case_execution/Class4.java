package disable_test_case_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class4 
{
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
	@Test
	public void tc4()
	{
		Reporter.log("Ruuning Tc4",true);
	}
	

}
