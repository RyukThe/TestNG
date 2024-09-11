package grouping_of_test_cases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class6
{
	@Test (groups="profile")
	public void mw()
	{
		Reporter.log("Running mw",true);
		
	}
	
	
	@Test(groups="setting")
	public void mk()
	{
		Reporter.log("running mk",true);
	}

}
