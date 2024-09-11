package KeyWords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1
{
	@Test(timeOut = 6000)
	public void login() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("Running login",true);
	}
	
	@Test (dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	
}
