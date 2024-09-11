package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class17
{
	@Test
	public void iframe()
	{
		WebDriver l = new ChromeDriver();
		l.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		l.switchTo().frame("iframeResult");
		l.findElement(By.xpath("//button[contains(text(),'Click me t')]")).click();
		l.switchTo().parentFrame();
		l.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}

}
