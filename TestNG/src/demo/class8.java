package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class class8 
{
	@Test
	public void Armstrongnumber()
	{
		int a =153;
		int sum=0;
		for(int i=a;i>0;i=i/10)
		{
			int rem =i/10;
			sum=sum+(rem*rem*rem);
		}
		
		
		if(sum==a)
		{
			Reporter.log("Given number is Armstrong",true);
		}
		else
		{
			Reporter.log("given number is Arm strong",true);
		}
	}
	
	@Test
	public void countArmstrongFrom1To1000()
	{
		for(int i=1;i<=1000;i++)
		{
			
			int sum=0;
			for(int j=i;j>0;j=j/10)
			{
				int rem=j%10;
				sum=sum+(rem*rem*rem);
			}
			
			if(sum==i)
			{
				//String str = Integer.toString(i);
				//Reporter.log(str,true);
				System.out.println(i);
			}
		}
		
	}

}
