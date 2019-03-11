import java.util.*;

class Array1DTest2
{
    public static void main(String gopal[])
    {
	   int i;
       float a[];
       a=new float[5];
	   Scanner scan=new Scanner(System.in);
	   for(i=0;i<5;i++)
	   {
		   a[i]=scan.nextFloat();
	   }
       System.out.println(a);
	   System.out.println(" Length of array is " + a.length);
	   for(float e:a)
	   {
	     System.out.println(e);
	   }
	   
	}
	
}