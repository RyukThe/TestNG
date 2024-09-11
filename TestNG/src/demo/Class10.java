package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class10 
{
	@Test
	public void openbrowser()
	{
		WebDriver you=new ChromeDriver();
		Reporter.log("Lest open youtube",true);
		you.get("https://www.youtube.com/");
		
	}
	
	@Test
	public void reversenumber()
	{
		int a=4854754;
		int rev=0;
		for(int i=a;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		
		System.out.println(rev);
	}
	

}
