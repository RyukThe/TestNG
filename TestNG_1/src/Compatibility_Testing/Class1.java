package Compatibility_Testing;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1
{
	@Parameters("Browser_Name")
	@Test
	public void openBrowser(String Browser_Name) throws InterruptedException
	{
		WebDriver m=null;
		if(Browser_Name.equals("chrome"))
		{
			m=new ChromeDriver();
		}
		else if(Browser_Name.equals("firefox"))
		{
			m= new FirefoxDriver();
		}
		else if (Browser_Name.equals("edge"))
		{
			m=new EdgeDriver();
		}
		
		m.get("https://www.facebook.com");
		
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		m.switchTo().newWindow(WindowType.TAB);
		
		
		m.get("https://www.google.com");
		
		m.switchTo().newWindow(WindowType.TAB);
		m.get("https://www.javapoint.com/");
		Set<String> Tab = m.getWindowHandles();
		
		for(String close:Tab)
		{
			m.switchTo().window(close);
			m.close();
			Thread.sleep(2000);
		}
		
	}

}
