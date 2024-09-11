package grouping_of_test_cases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 
{
	@Test (groups="login")
	public void Tc1()
	{
		Reporter.log("running tc1",true);
	}
	@Test(groups="login")
	public void Tc2()
	{
		Reporter.log("running method tc2",true);
		
		
	}
	
	
	@Test (groups="profile")
	public void tc3()
	{
		Reporter.log("running method tc3",true);
	}

}
