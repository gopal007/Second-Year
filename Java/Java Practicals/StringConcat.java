import java.util.Scanner;	

class StringConcat
	{
	public static void main(String [] p)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("ENTER  2  STRING : ");
			String s1 = scan.nextLine();
			String s2 = scan.nextLine();
			
			String s = s1.concat(s2);
			System.out.println(s);
			
		}
		
	}
