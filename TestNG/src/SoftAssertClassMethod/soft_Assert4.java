package SoftAssertClassMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_Assert4 
{
	@Test
	public void tc1()
	{
		SoftAssert st= new SoftAssert();
		String s1= "hello";
		String s2="hi";
		st.assertEquals(s1, s2,"fail: both results are not same");
		boolean tc=true;
		st.assertFalse(tc,"fail:expected false get true");
		st.assertAll();
		
	}

}
