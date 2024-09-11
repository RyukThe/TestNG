package SoftAssertClassMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_Assert5
{
	@Test
	public void tc1()
	{
		SoftAssert st= new SoftAssert();
		String actR= "hello";
		String s2="hi";
		st.assertEquals(actR, s2,"fail: both results are not same");
		st.assertNotEquals(actR, s2,"fail : both results are same");
		boolean tc=true;
		st.assertFalse(tc,"fail:expected false get true");
		st.assertAll();
		
	}

}
