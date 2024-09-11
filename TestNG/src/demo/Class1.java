package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 
{
	
	@Test
	public void tc1()
	{
		tc2();
	}




	public void tc2()
	{
		WebDriver m= new ChromeDriver();
		
		m.get("https://www.facebook.com/");
		m.close();
	}
}
