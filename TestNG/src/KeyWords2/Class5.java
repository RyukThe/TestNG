package KeyWords2;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class5
{
	@Test(timeOut=5000)
	public void Tc1()
	{
		Scanner m = new Scanner(System.in);
		
		int num;
		do
		{
			Reporter.log("Enter number between ",true);
			num=m.nextInt();
		}while(num<10||num>145);
		
		for(int i=num;i<=145;i++)
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
	
	@Test(dependsOnMethods="Tc1")
	public void tc2()
	{
		Reporter.log("Running Tc2",true);
	}

}
