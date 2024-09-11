package Prallel_execution_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Class1 
{
	
	@Test
	public void OpenepicStore() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.drive","D:\\selenium\\chromedriver.exe");
		WebDriver o= new ChromeDriver();
		o.manage().window().maximize();
		o.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		o.get("https://www.epicgamestore.com/");
		
		
		
		o.switchTo().newWindow(WindowType.TAB);
		
		
		o.get("https://www.facebook.com/");
		Thread.sleep(2000);
		o.quit();
		
	}

}
