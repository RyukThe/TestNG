package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class18 
{
	@Test
	public void dynamicelement()
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.amazon.in/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("oneplus 10 pro");
		m.findElement(By.xpath("//input[contains(@id,'submit-b')]")).click();
		String s = m.findElement(By.xpath("((//div[@class='sg-row'])//span)[257]")).getText();
		System.out.println(s);
		
		
		
	}

}
