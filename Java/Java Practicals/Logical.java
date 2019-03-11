//JAVA PROGRAM FOR UNDERSTANDING LOGICAL OPERATOR
class Logical
{
	public static void main(String args[])
	{
		boolean x=true;
		boolean y=false;
		
		boolean a=x&&y;
		boolean b=x||y;
		boolean c=!x;
		boolean d=!y;
		
		System.out.println("x= "+x+"  y= "+y);
		System.out.println("\nx&&y ="+a+"\nx||y ="+b+"\n!x  ="+c+"\n!y  ="+d);
	}
}
