package KeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_Keyword1_invocationCount 
{
	
	@Test(invocationCount = 3)
	public void TC1() 
	{
		Reporter.log("--running TC1--",true);
	}
	
}
