package disable_test_case_execution;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Class6
{
	@Test
	public void m1()
	{
		Scanner m= new Scanner(System.in);
		System.out.println("Eneter String Value");
		String s=m.nextLine();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if (rev.equals(s))
		{
			System.out.println("given string is palindrom");
		}
		else
		{
			System.out.println("given string is not palindrome");
			
		}
	}

}
