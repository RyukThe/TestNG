package demo;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.testng.annotations.Test;

public class Class5
{
	@Test
	public void mk()
	{
		int a[]= {54,545,894};
		int b[]= {58,45,545};
		int c[]= {58,45,545};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, a));
	}

}
