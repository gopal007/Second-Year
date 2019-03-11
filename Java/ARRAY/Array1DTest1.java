class Array1DTest1
{
	public static void main(String args[])
	{
		int i;
		int g[]={45,56,98,03,545};
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=90;
		
		System.out.println(a); //prints type & addresss.
		System.out.println();
		
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		for(int j=0;j<g.length;j++)
		{
           System.out.println(g[j]);
		}		   
	}
}