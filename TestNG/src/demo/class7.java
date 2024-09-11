package demo;

import org.testng.annotations.Test;

public class class7
{
	@Test
	public void evennumber()
	{
		for (int i =0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
		
	
	@Test
	public void oddnumber()
	{
		for(int i=0;i<1000;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
