// JAVA PROGRAM FOR FABONACCI SERIES.....

import java.util.Scanner;
class Fabonacci
{
   public static void main(String [] p )
   {
       int f1,f2,f3;
       f1=0;
       f2=1;
       
       System.out.println("HOW MANY NUMBERS OF FABONACCI SERIES TO PRINT : ");
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       
       System.out.print("\n\n"+f1+" ");
       System.out.print(" "+f2);
       
       for(int i =1 ; i <= a ; i++)
       {
          f3 = f1 +f2 ;
          f1 = f2 ;
          f2 = f3 ;
          System.out.print(" "+f3);
       }    
   }
}
