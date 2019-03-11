import java.util.Arrays;
import java.util.Scanner;

  class DecimalToHexadecimal
  {
	  public static void main(String [] args )
	  {
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.printf("\n\n\t\t\t\t YOU ARE CURRENTLY USING GOPAL'S DECIMAL TO HEXADECIMAL CONVERTER \n\n\n");
		  
	findanother:
      for(;;)
	  {		  
		  System.out.println("ENTER DECIMAL NUM TO FIND ITS HEXADECIMAL EQUIVALENT ");
		  int dnum = scan.nextInt() ;
		  int ddnum = dnum , count = 0;
		  
		  
		  for( int i = 0  ; ; i++)
		  {
			  //int b = ddnum % 16 ;
			  ddnum = ddnum / 16 ;
			  count++;
			  if(ddnum==0)
			  {
				  break;
			  }
		  }
		  
		  
		  
		  int hexnum [] = new int [count];
		  

		  for(int a = 0 ; a < count ;a++)
		  {
			  int b = dnum % 16 ;
			  if(b==10)
			  {
			     b = 'A' ;
			  }
			  
			  if(b==11)
			  {
			     b = 'B' ;
			  }
			  
			  if(b==12)
			  {
			     b = 'C' ;
			  }
			  
			  if(b==13)
			  {
			     b = 'D' ;
			  }
			  
			  if(b==14)
			  {
			     b = 'E' ;
			  }
			  
			  if(b==15)
			  {
			     b = 'F' ;
			  }
			  
			  hexnum[a] = b ; 
			  dnum = dnum / 16 ;
		  }
		  
		  char g;
		  System.out.print("\n\n HEXADECIMAL EQUIVALENT IS :  ");
		  for(int a = (count - 1) ; a >= 0 ; a--)
		  {
			  if(hexnum[a]>64){
			   g=(char)hexnum[a];
			   System.out.print(g+" ");
			  }
			  else{
				  System.out.print(hexnum[a]+" ");
			  }
		  }
		  
		  System.out.printf("\n\n");
		  
		   System.out.println("\n\nDO YOU WANT FIND HEXADECIMAL EQUIVALENT FOR ANOTHER NUMBER ?     (Y/N) ");
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