package grouping_of_test_cases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 
{
	@Test (groups="login")
	public void tc7()
	{
		Reporter.log("Running tc7",true);
	}
	
	@Test(groups="profile")
	public void tc8()
	{
		Reporter.log("Running tc8",true);
	}
	
	@Test(groups="setting")
	public void Tc9()
	{
		Reporter.log("Running Tc9",true);
	}

}
