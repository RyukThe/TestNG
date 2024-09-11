package Compatibility_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class5 
{
	@Parameters("br_name")
	@Test
	public void openBrowser(String br_name) throws InterruptedException
	{
		WebDriver m= null;
		if(br_name.equals("firefox"))
		{
			m= new FirefoxDriver();
		}
		else if (br_name.equals("edge"))
		{
			m= new EdgeDriver();
		}
		else if (br_name.equals("chrome"))
		{
			m = new ChromeDriver();
		}
		
		m.get("https://vctcpune.com/");
		
		Thread.sleep(2000);
		m.quit();
		
	}

}
