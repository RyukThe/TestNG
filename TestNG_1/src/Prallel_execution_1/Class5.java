package Prallel_execution_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Class5
{	

	@Parameters("Browser_name")
	@Test
	public void openZuluAndGoku_io(String Browser_name) throws InterruptedException
	{
		WebDriver driver=null;
	if(Browser_name.equals("chrome"))
	{
		driver= new ChromeDriver();
		
	}
	else if (Browser_name.equals("firefox"))
	{
		driver= new FirefoxDriver();
	}
	
	else if (Browser_name.equals("edge"))
	{
		driver= new EdgeDriver();
	}
	
	


	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.linkedin.com/");
	
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.quit();
	}

}
