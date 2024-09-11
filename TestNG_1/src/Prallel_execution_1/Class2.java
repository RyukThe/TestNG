package Prallel_execution_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2
{
	@Test
	public void openZuluAndGoku_io() throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.get("https://www.linkedin.com/");
		
		m.switchTo().newWindow(WindowType.TAB);
		
		m.get("https://www.youtube.com/");
		Thread.sleep(2000);
		m.quit();
	}

}
