import java.util.Scanner;
import java.util.Arrays;

class LowerCase
{
    public static void main(String[]p)
    {
        System.out.println("LINE TYPE KARA :");
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
		
		char []chararr = str.toCharArray(); 
		
		for(int i=0;i<chararr.length;i++)
		{
                int a = (int)chararr[i];
				int b;
				if(a<97)
				{
					if(a<65)
					{
						b = a;
					}
					else
					{
				        b = a + 32;
					}
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