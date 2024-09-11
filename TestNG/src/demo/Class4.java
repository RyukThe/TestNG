package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class4 
{
	@Test
	public void multiplenumber()
	{
		int a=5;
		int b=4;
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+b;
		}
		System.out.println(sum);
		Reporter.log("sum="+sum,true);
	}

}
