package TestSuite;

import java.util.Scanner;

public class class1w
{
	public static void main(String[] args)
	{
		Scanner m = new Scanner(System.in);
		//System.out.println("enter any number between 10 to 30");
		
		
		 int n;
		 do
		 {
			 System.out.println("Enter any number between 10 and 30; ");
			 n=m.nextInt();
		 }
		 while(n<10||n>30);
		 
		
		for(int i=n;i<=30;i++)
		{
		
		
			if(i%2==0)
			{
				System.out.println(i);
			}
		
			
		}
		
	
		int n1;
		do
		{
			System.out.println("Enter any number  between 50 to 100");
			n1=m.nextInt();
		
		}
		while(n1<50||n>100);
		for(int i=n1;i<=100;i++)
		{
		if(i%2!=0)
			{
			System.out.println(i);
			}
	}
	}

}
