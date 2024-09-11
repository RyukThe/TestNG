package SoftAssertClassMethod;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_Assert2
{
	@Test
	public void tc1()
	{
		SoftAssert soft= new SoftAssert();
		String s="Saurav";
		String s2="saurav";
		soft.assertEquals(s, s2);
		
		boolean actr=true;
		soft.assertTrue(actr);
		soft.assertAll();
		
		
	}

}
