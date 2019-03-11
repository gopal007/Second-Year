class NumOfObject
{
	static int count = 0 ;
	
	NumOfObject()
	{
		count++;
	}
	
	public static void main(String [] p)
	{
		NumOfObject ob1 = new NumOfObject();
		NumOfObject ob2 = new NumOfObject();
		NumOfObject ob3 = new NumOfObject();
		System.out.println("NUM OF OBJ ARE : " + count);
	}
}