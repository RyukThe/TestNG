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

public class Class3
{
	@Parameters("Browser_name")
	@Test
	public void Comp(String Browser_name) throws InterruptedException
	{
		WebDriver m= null;
		if(Browser_name.equals("chrome"))
		{
			m= new ChromeDriver();
		}
		else if(Browser_name.equals("firefox"))
		{
			m=new FirefoxDriver();
			
		}
		else if(Browser_name.equals("edge"))
		{
			m= new EdgeDriver();
		}
		
		
		m.get("https://www.cricbuzz.com/");
		
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		m.switchTo().newWindow(WindowType.TAB);
		
		m.get("https://www.hotstart.com/");
		
		m.switchTo().newWindow(WindowType.TAB);
		
		m.get("https://www.postman.com/");
		
		
		Set<String> tb = m.getWindowHandles();
		
		for(String cl:tb)
		{
			m.switchTo().window(cl);
			
			m.close();
			
			Thread.sleep(2000);
		}
		
		
	}

}
