package Prallel_execution_1;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4
{
	@Test 
	public void tc1()
	{
		WebDriver m = new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		m.get("https://www.instagram.com/");
		m.manage().window().minimize();
		m.switchTo().newWindow(WindowType.TAB);


	
		m.get("https://www.facebook.com/");

		m.switchTo().newWindow(WindowType.TAB);
		
		m.get("https://www.motorola.com/");
		
		Set<String> wind = m.getWindowHandles();
		
		for(String w:wind)
		{
			m.switchTo().window(w);
			m.close();
		}
		
	}

}
