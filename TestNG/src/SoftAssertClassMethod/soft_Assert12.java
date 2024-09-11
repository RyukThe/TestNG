package SoftAssertClassMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_Assert12 
{
	@Test
	public void tc1()
	{
		SoftAssert sf= new SoftAssert();
		String s="saurav";
		String s2="Saurav";
		sf.assertEquals(s, s2,"fail : both results are diffrent ");
		sf.assertNotEquals(s, s2,"fail: both result is same");
		boolean m= true;
		sf.assertTrue(m,"fail: expected true get false");
		sf.assertFalse(m,"fail: expected false but get true");
		sf.assertAll();
		
		
	}

}
