package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class20 
{
	
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Opning browser",true);
	}
	
	@BeforeMethod
	public void loginApp()
	{
		Reporter.log("login app",true);
	}
	
	
	@Test
	public void tc1()
	{
		Reporter.log("verify Log",true);
	}
	
	
	@AfterMethod
	public void logoutapp()
	{
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void closebroweer()
	{
		Reporter.log("close",true);
	}
	

}
