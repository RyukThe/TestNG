package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 
{
	@Test
		public void Test_case1() throws InterruptedException
	{
		
		Reporter.log("Test_Case1,",true);
		WebDriver m = new ChromeDriver();
		m.get("https://www.W3Shcool.com");
		
		Thread.sleep(2000);
		m.close();
		
	}
	
	@Test
	public void tc1()
	{
		tc2();
	}




	public void tc2()
	{
		WebDriver m= new ChromeDriver();
		
		m.get("https://www.facebook.com/");
		m.close();
	}

}
