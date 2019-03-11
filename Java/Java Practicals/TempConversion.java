//JAVA PROGRAM FOR TEMPERATURE CONVERTION....

import java.util.Scanner;

class TempConversion
{
   public static void main(String [] p)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("\n\nENTER TEMPERATURE IN CELCIUS : ");
      double c = scan.nextInt();
      double f = (1.8*c+32);
      System.out.print("\n\nTEMPERATURE IN FAHRENHEIT : "+f);
      
   }
   
}
      
