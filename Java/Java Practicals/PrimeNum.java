// JAVA PROGRAM FOR PRINTING PRIME NUMBERS.....
import java.util.Scanner;

class PrimeNum
 {  
     public static void main(String [] P)
      {  
	    Scanner scan = new Scanner(System.in);
        System.out.print("ENTER NUM. UPTO WHICH YOU WANT TO PRINT PRIME NUMBERS :");   
        int l= scan.nextInt(); 
		System.out.println();
		
		for(int n=2;n<=l;n++)
		{
           int count=0;
           for(int i=2;i<=n/2;i++)
		    {    
               if(n%i==0)
		        {        
                   count++; 
                   	   
                }    
            }  
		
        if(count==0)    
        System.out.print(n+" ");  
        }	
     }  
}  