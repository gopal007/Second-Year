//Single inheritance

class P
{
	void test()
	{
		System.out.println("Rohit");
	}
}

class B extends P
{
	public static void main(String[] args)
	{
		B a=new B();
		a.test();
		System.out.println("Sharma");
	}

}
