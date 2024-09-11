package KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class10 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running test Case 1",true);
	}
	
//-------------------------------------------------------------------------------------------
	
	
	@Test(priority = -1,invocationCount=8)
	public void TC2()
	{
		Reporter.log("Running test Case 2",true);
	}
	
	
//-----------------------------------------------------------------------------------------------	
	
	@Test(priority = 2,invocationCount = 2)
	public void TC3()
	{
		Reporter.log("Running test case 3",true);
	}
	
//--------------------------------------------------------------------------------------------
	
	@Test(enabled=false)
	public void TC4()
	{
		Reporter.log("Running test Case 4",true);
	}
//--------------------------------------------------------------------------------------
	
	@Test(priority = 7,invocationCount=5)
	public void TC5()
	{
		Reporter.log("Running test Case 5",true);
	}
	
//------------------------------------------------------------------------------------------
	
	@Test(priority = 5)
	public void TC6() 
	{
		Reporter.log("Running test case 6",true);
	}

//---------------------------------------------------------------------------------------------
	@Test(priority = 6, invocationCount=4)
	public void TC7()
	{
		Reporter.log("Running test case 7 ",true);
	}
	



}
