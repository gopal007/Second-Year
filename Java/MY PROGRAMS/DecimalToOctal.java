import java.util.Arrays;
import java.util.Scanner;

  class DecimalToOctal
  {
	public static void main(String [] args )
	{
		System.out.printf("\n\n\t\t\t\t YOU ARE CURRENTLY USING GOPAL'S DECIMAL TO OCTAL CONVERTER \n\n\n");
		Scanner scan = new Scanner(System.in);

	findanother:
		  
	  for(;;)  
	   {
	
		     System.out.println("ENTER DECIMAL NUM TO FIND ITS OCTAL EQUIVALENT ");
		     int dnum = scan.nextInt() ;
		     int ddnum = dnum , count = 0;
		  
		  
		     for( int i = 0  ; ; i++)
		        {
			         //int b = ddnum % 8 ;
			         ddnum = ddnum / 8 ;
			         count++;
			         if(ddnum==0)
			           {
				           break;
			           }
		        }
		  
		  
		  
		     int octal [] = new int [count];

		     for(int a = 0 ; a < count ;a++)
		        {
			         octal[a] = dnum % 8 ;
			         dnum = dnum / 8 ;
		        }
		  
		  
		      System.out.print("\n\nOCTAL EQUIVALENT IS :  ");
		      for(int a = (count - 1) ; a >= 0 ; a--)
		         {
			         System.out.printf(octal[a]+" ");
		         }
		  
	          System.out.println("\n\nDO YOU WANT FIND OCTAL EQUIVALENT FOR ANOTHER NUMBER ?     (Y/N) ");
			  char key = scan.next().charAt(0);
			  if(key=='y'  || key=='Y')
			  {
				  continue findanother;
			  }
			  else
			  {
				  break;
			  }
	
		}
		  
		  
		  
		  
	}
	  
  }