// str.reverse()......str.delete(4,7)......str.deleteCharAt(int num).....str.replace(from, to, "string")

import java.io.*;

   class String1
   
   {
	   public static void main(String [] p )
	   
	   {
		   StringBuffer sb = new StringBuffer("GOPAL");
		   
		   System.out.println("\nLENTH OF STRING IS : " + sb.length());
		   System.out.println("CAPACITY OF STRING IS : " + sb.capacity());
		   System.out.println(sb);
		   
		   sb.append("   ASHOK");
		   System.out.println("\nLENTH OF STRING IS : " + sb.length());
		   System.out.println("CAPACITY OF STRING IS : " + sb.capacity());
		   System.out.println(sb);
		   
		   sb.append("   GAWANDE");
		   System.out.println("\nLENTH OF STRING IS : " + sb.length());
		   System.out.println("CAPACITY OF STRING IS : " + sb.capacity());
		   System.out.println(sb);
		   
		   /*   sb.insert(25 , "  SGGS");                // GIVES OUT OF BOUND EXCEPTION AS LENGTH IS ONLY 23
		   System.out.println(sb);

            */		   
		   
		   
	   }
	   
   }


