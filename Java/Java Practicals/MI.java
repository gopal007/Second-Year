

class S
{
	void test()
	{
		System.out.println("Narendra");
	}
}

 class C extends S
{   
	void print()
	{
		System.out.println("Damodhardas");
	}
}

class Q  extends C
{
	public static void main(String[] args) 
	{
		Q s=new Q();
		s.test();
		s.print();
		System.out.println("Modi");
	}

}
