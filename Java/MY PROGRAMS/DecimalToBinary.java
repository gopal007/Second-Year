import java.util.Arrays;
import java.util.Scanner;

  class DecimalToBinary
  {
	  public static void main(String [] args )
	  {
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.printf("\n\n\t\t\t\t YOU ARE CURRENTLY USING GOPAL'S DECIMAL TO BINARY CONVERTER \n\n\n");
		  
	findanother:	  
      for(;;)
	  {
		  System.out.println("ENTER DECIMAL NUM TO FIND ITS BINARY EQUIVALENT ");
		  int dnum = scan.nextInt() ;
		  int ddnum = dnum , count = 0;
		  
		  
		  for( int i = 0  ; ; i++)
		  {
			  //int b = ddnum % 2 ;
			  ddnum = ddnum / 2 ;
			  count++;
			  if(ddnum==0)
			  {
				  break;
			  }
		  }
		  
		  
		  
		  int binum [] = new int [count];

		  for(int a = 0 ; a < count ;a++)
		  {
			  binum[a] = dnum % 2 ;
			  dnum = dnum / 2 ;
		  }
		  
		  
		  System.out.print("\n\nBINARY EQUIVALENT IS :  ");
		  for(int a = (count - 1) ; a >= 0 ; a--)
		  {
			  System.out.printf(binum[a]+" ");
		  }
		  
		  System.out.printf("\n\n");
		  
		  System.out.println("\n\nDO YOU WANT FIND BINARY EQUIVALENT FOR ANOTHER NUMBER ?     (Y/N) ");
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