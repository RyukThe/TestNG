package disable_test_case_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class5
{
	@Test
	public void m1()
	{
		for(int i=1;i<=100;i++)
		{
			int count =0;
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
	
	@Test
	public void tc1()
	{
		Reporter.log("running tc1",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("running tc2",true);
	}

}
