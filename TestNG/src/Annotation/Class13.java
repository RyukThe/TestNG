package Annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class13
{
	 @BeforeClass
	 public void openBrowser()
	 {
		 Reporter.log("Opning browser",true);
	 }
	 @BeforeMethod
	 public void login()
	 {
		 Reporter.log("login in App",true);
	 }
	 
	 @Test
	 public void TC1()
	 {
		 Reporter.log("Running Test case 1",true);
	 }
	 
	 @Test
	 public void TC2()
	 {
		 Reporter.log("Running Test Case 2",true);
	 }
	 @Test
	 public void TC3()
	 {
		 Reporter.log("Running Test Case 3",true);
	 }
	 @Test
	 public void TC4()
	 {
		 Reporter.log("Running Test Case 4",true);
	 }
	 
	 @AfterMethod
	 public void logout ()
	 {
		 Reporter.log("loging out from app",true);
	 }
	 @AfterClass
	 public void closeBRowser()
	 {
		 Reporter.log("Closing Browser",true);
	 }
}
