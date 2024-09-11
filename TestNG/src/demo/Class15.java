package demo;

import org.testng.annotations.Test;

public class Class15
{
	@Test
	public void countWhiteSpaces()
	{
		String s="S S S S S S SAS  SA S AS ";
		int count=0; 
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}
