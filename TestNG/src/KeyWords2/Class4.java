package KeyWords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class4
{
	@Test(timeOut=5010,priority = 1,invocationCount=5)
	public void Tc2()
	{
		Reporter.log("Tc2",true);
		
	}
	
	@Test(dependsOnMethods="Tc2")
	public void Tc1()
	{
		Reporter.log("Running method Tc2",true);
	}
	

}
