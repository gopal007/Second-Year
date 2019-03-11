// java program for parameterized constructor.

public class Constructor2
	{
		Constructor2(int a,int b)
		{
			System.out.println("Area of rectangle is "+(a*b));
		}
		
		public static void main(String[]args)
			{ 	
				Constructor2 a=new Constructor2(5,3);
			}
	}