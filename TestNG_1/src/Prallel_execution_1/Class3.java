package Prallel_execution_1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class3
{
	@Test
	public void openoneplus() throws InterruptedException
	{
		WebDriver m= new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		m.get("https://www.oneplus.in/");
		
		m.switchTo().newWindow(WindowType.TAB);
		m.get("https://www.hp.com/in/");
		
		Thread.sleep(2000);
		Set<String> windows = m.getWindowHandles();
//		for(String window:windows)
//		{
//			m.switchTo().window(window);
//			m.close();
		
//		}
		
		ArrayList<String> ml= new ArrayList<String> (windows);
	
		
		for(int i=0;i<=1;i++)
		{
			m.switchTo().window(ml.get(i));
			m.close();
			
		}
		
	}

}
