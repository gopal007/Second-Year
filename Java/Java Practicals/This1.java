//Program to demonstrate this keyword for constructor to refer current class constructor

class Constructor
{
	private int length;
	private int breadth;
	
	Constructor(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int area()
	{
		return(length*breadth);
	}
}
class ThisTest 
{
	public static void main(String[] args)
	{
		Constructor c=new Constructor(5,5);
		System.out.println("area of rectangle is: "+c.area());
	}
}
