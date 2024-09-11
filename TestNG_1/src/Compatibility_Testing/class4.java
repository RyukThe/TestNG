package Compatibility_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class4 
{

	@Parameters("br_name")
	@Test
	public void tc2(String br_name) throws InterruptedException
	{
		
		WebDriver m= null;
		if(br_name.equals("chrome"))
		{
			m=new ChromeDriver();
		}
		else if(br_name.equals("edge"))
		{
			m=new EdgeDriver();
		}
		else if(br_name.equals("firefox"))
		{
			m= new FirefoxDriver();
		}
		
		m.get("https://www.jira.com/");
		
		Thread.sleep(2000);
	
		m.quit();
	}
}
