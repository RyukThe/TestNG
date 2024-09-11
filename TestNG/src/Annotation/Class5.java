package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class5 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open browser ",true);
	}
	@BeforeMethod 
	public void loginApp ()
	{
		Reporter.log("login app",true);
	}
	@Test
	public void Tc2 ()
	{
		Reporter.log("running TC3",true);
	}
	 
	
	@Test
	public void tc3()
	{
		Reporter.log("running TC3",true);
	}
	
	@AfterMethod
	public void Tc3 ()
	{
		Reporter.log("logout ",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Closing broswer",true);
	}
}
