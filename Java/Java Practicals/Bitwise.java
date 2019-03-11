//JAVA PROGRAM FOR UNDERSTANDING BITWISE OPERATOR

class Bitwise
{
	public static void main(String args[])
	{
		
		int a=12,b=14;
		int c=b<<2;
		int d=a>>3;
		int e=~b;
		int g=a&b;
		int h=a|b;
		int i=a>>>3;
		
		System.out.println("a="+a+" b="+b);
		System.out.println();
		System.out.println("b<<2 ="+c);
		System.out.println("a>>>3="+i);
		System.out.println("a>>3 ="+d);
		System.out.println("~b ="+e);
		System.out.println("a&b ="+g);
		System.out.println("a|b ="+h);
	}
}
