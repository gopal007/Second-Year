import java.util.Scanner;
import java.util.Arrays;

class UpperCase
{
    public static void main(String[]p)
    {
        System.out.print("LINE TYPE KARA :");
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
		
		char []chararr = str.toCharArray(); 
		
		for(int i=0;i<chararr.length;i++)
		{
                int a = (int)chararr[i];
				int b;
				if(a>96)
				{
				 b = a - 32;
				}
				else
				{
				  b = a;
				}
				char c = (char)b;
        System.out.print(c);
		}
    }
}