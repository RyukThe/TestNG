package KeyWords2;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 
{
	@Test(timeOut=6000)
	public void Tc1() throws InterruptedException
	{
		Thread.sleep(60000);
		Scanner m= new Scanner(System.in);
		int n;
		do
		{
			Reporter.log("Enter number between 10 to 50 ",true);
			n=m.nextInt();
		}while(n<10||n>500);
		
		
		for(int i=n;i<=500;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count ++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
			}
			
		}
	}
	
	@Test(dependsOnMethods="Tc1")
	public void tc2()
	{
		Reporter.log("Tc2 is running ",true);
	}

}
