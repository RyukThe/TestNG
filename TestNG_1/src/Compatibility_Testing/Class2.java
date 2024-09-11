package Compatibility_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2
{
	@Parameters("Browser_name")
	@Test
	public void openBroswers(String Browser_name) throws InterruptedException
	{
		WebDriver m=null;
		if(Browser_name.equals("chrome"))
		{
			m=new ChromeDriver();
		}
		else if (Browser_name.equals("firefox"))
		{
			m= new FirefoxDriver();
		}
		else if(Browser_name.equals("edge"))
		{
			m=new EdgeDriver();
			
			
		}
		
		
		m.get("https://www.nft.com/");
		
		Thread.sleep(2000);
		
		m.quit();
		
		
	}

}
