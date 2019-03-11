// Program to calculate area by calling one function using another within same class using this keyword

class TestMethod
{
	 private int length;
	 private int breadth;

	void testMethod1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int testMethod2()
	{
		this.testMethod1(5,5);
		return(length*breadth);
	}
}

class Function
{
	public static void main(String[] args)
	{
		TestMethod t=new TestMethod();
		System.out.println("area of rectangle is: "+t.testMethod2());
	}

}



