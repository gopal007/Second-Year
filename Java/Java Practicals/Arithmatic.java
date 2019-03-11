// JAVA PROGRAM FOR ARITHMATIC CALCULATIONS.....

import java.util.Scanner;

class Arithmatic
{
   public static void main(String [] p)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\nENTER TWO NUMBERS : ");
      
      double a = scan.nextDouble();
      double b = scan.nextDouble();
      
      System.out.println("ADDITION OF GIVEN NUMBERS IS : "+(a+b)+"\n\n");
      System.out.println("SUBTRACTION OF TWO NUMBERS IS : "+(a-b)+"\n\n");
      System.out.println("MULTIPLICATION OF TWO NUMBERS IS : "+(a*b)+"\n\n");
      System.out.println("DIVISION OF TWO NUMBERS IS : "+(a/b)+"\n\n");
      System.out.println("MODULUS OF TWO NUMBERS IS : "+(a%b)+"\n\n");
      
    }
    
}
      
