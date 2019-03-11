// JAVA PROGRAM FOR FINDING FACTORIAL OF NUMBER   

import java.util.Scanner;

class Factorial
{
	public static void main(String [] p )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ENTER +ve INTEGER TO ITS FACTORIAL : ");
		int a = scan.nextInt();
		int b=1;
		
		System.out.println();
		if(a<0)
		{
			System.out.println(a+" INVALID INTEGER");
		}
		else
		{
			for(int i=a; i>=1; i--)
			{
				b=i*b;
			}
		}
		System.out.println("FACTORIAL OF "+a+" IS "+b);
		
	}
	
}