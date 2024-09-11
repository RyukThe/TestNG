package KeyWords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class11 
{
	@Test(timeOut=6000,priority=1)
	public void Tc1()
	{
		Reporter.log("Ruuning Tc1",true);
	}
	
	@Test(timeOut=6000,invocationCount = 5,dependsOnMethods="Tc3")
	public void Tc2()
	{
		Reporter.log("Ruuning Tc2",true);
	}
	
	@Test(timeOut=6000,invocationCount=4,priority=0,dependsOnMethods="Tc1")
	public void Tc3()
	{
		Reporter.log("Ruuning Tc3",true);
	}
	
	@Test(timeOut=6000,dependsOnMethods="Tc3")
	public void Tc4()
	{
		Reporter.log("Ruuning Tc4",true);
	}
	

}
