package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example1_Annotations 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("-open browser-",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("--login to App--",true);
	}
	
	@Test
	public void verifyLogo1() 
	{
		Reporter.log("running verifyLogo1 test script", true);
	}
	
	@Test
	public void verifyLogo2() 
	{
		Reporter.log("running verifyLogo2 test script", true);
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("--logout from App--",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("-close browser-",true);
	}
	
}