package grouping_of_test_cases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 
{
	@Test(groups="login")
	public void login()
	{
		Reporter.log("Login",true);
	}
	@Test(groups="profile")
	public void profile()
	{
		Reporter.log("profile",true);
	}
	
	@Test (groups="setting")
	public void setting()
	{
		Reporter.log("settings",true);
	}
}
