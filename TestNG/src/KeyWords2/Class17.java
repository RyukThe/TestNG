package KeyWords2;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class17
{
	@Test(priority = 2)
	public void Tc1()
	{
		Scanner  sc= new  Scanner(System.in);
		Reporter.log("Enter numbre",true);
		int num=sc.nextInt();
		int count=0;
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("given number is not prime ");
		}
		else
		{
			System.out.println("given number is prime ");
		}
	}

	
	@Test(timeOut=6000, dependsOnMethods="Tc1")
	public void Tc2()
	{
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}
}
