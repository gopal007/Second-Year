// JAVA PROGRAM FOR FINDING NUMBER IS EVEN/ODD  

import java.util.Scanner;

class OddOrEven
{
	public static void main(String [] p )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ENTER AN INTEGER TO CHECK ODD OR EVEN : ");
		int a = scan.nextInt();
		
		System.out.println();
		if(a%2 == 0 )
		{
			System.out.println(a+" IS EVEN NUMBER.");
		}
		else
		{
			System.out.println(a+" IS ODD NUMBER.");
		}
		
	}
	
}