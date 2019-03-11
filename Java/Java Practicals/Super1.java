//Program for accessing  superclass method and instance variable

class SuperClass
{
	public int a=10;
	public void a()
	{
		System.out.println("I am from Super Class");
	}
}

class SubClass extends SuperClass
{
	public int a=102;
	public void a()
	{
	    super.a();
		System.out.println("I am from Sub Class");
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String args[])
	{
		SubClass p=new SubClass();
		p.a();
	}
}
