package KeyWords2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class18
{
	@Test (timeOut=4545,priority= 1)
	public void TC1()
	{
		Reporter.log("Ruuning Tc1",true);
	}
	@Test (timeOut=4545, priority =2)
	public void TC2()
	{
		Reporter.log("Ruuning Tc2",true);
	}

	@Test (timeOut=4545,priority =5)
	public void TC3()
	{
		Reporter.log("Ruuning Tc3",true);
	}

	@Test (timeOut=4545)
	public void TC4()
	{
		Reporter.log("Ruuning Tc4",true);
	}

	@Test (timeOut=4545,dependsOnMethods= {"TC1","TC2","TC3","TC4"})
	public void TC5()
	{
		Reporter.log("Ruuning Tc5",true);
	}


}
