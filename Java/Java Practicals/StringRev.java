import java.util.Scanner;	
import java.util.Arrays;	

class StringRev
	{
	public static void main(String [] p)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("ENTER STRING : ");
			String s = scan.nextLine();
			
			char c[] = s.toCharArray();
			int a = c.length;
			for(int i =(a-1) ; i >= 0 ; i--)
				{
				 System.out.print(c[i]);
				}
				
		}
		
}
