  // default values in array.....


class ArrayDefaultValues
{
	public static void main(String  []p)
	
	{
		
		System.out.println("\n\nDEFAULT VALUES OF STRING ARRAY");
		String str[] = new String[3];
		for(String s : str)
		   {
			   System.out.print(s + " ");
		   }
		
		
		
		System.out.println("\n\nDEFAULT VALUES OF INTEGER ARRAY");
		int INT[] = new int[3];
		for(int i : INT)
		   {
			   System.out.print(i + " ");
		   }
		
		
		
		System.out.println("\n\nDEFAULT VALUES OF DOUBLE ARRAY");
		double Dnum[] = new double[3];
		for(double d : Dnum)
		   {
			   System.out.print(d + " ");
		   }
		
		
		System.out.println("\n\nDEFAULT VALUES OF BOOLEAN ARRAY");
		boolean bool[] = new boolean[3];
		for(boolean b : bool)
		   {
			   System.out.print(b + " ");
		   }
		
		
		
		System.out.println("\n\nDEFAULT VALUES OF REFERENCED ARRAY");
		ArrayDefaultValues ref[] = new ArrayDefaultValues[3];
		for(ArrayDefaultValues r : ref)
		   {
			   System.out.print(r + " ");
		   }
		
		
		
	}
}
		