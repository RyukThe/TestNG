package KeyWords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class15
{
	@Test(timeOut=6000,dependsOnMethods="Tc2")
	public void Tc1()
	{
		Reporter.log("Ruuning Tc1",true);
	}
	
	@Test(timeOut=6000,dependsOnMethods="Tc4")
	public void Tc2()
	{
		Reporter.log("Ruuning Tc2",true);
	}
	@Test(timeOut=6000,dependsOnMethods="Tc1")
	public void Tc3()
	{
		Reporter.log("Ruuning Tc3",true);
	}
	@Test(timeOut=6000)
	
	public void Tc4()
	{
		Reporter.log("Ruuning Tc4",true);
	}

}
