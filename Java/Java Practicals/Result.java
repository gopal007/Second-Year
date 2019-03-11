// PROGRAM TO FIND GRADE.....
import java.util.Scanner;
class Result
 {
    public static void main(String [] p)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("ENTER THE MARKS OF SUBJECT : \n");
       
       System.out.print("\nM - III  : ");
       int a = scan.nextInt();
       System.out.print("\nDSD      : ");
       int b = scan.nextInt();
       System.out.print("\nDM       : ");
       int c = scan.nextInt();
       System.out.print("\nOOPs     : ");
       int d = scan.nextInt();
       System.out.print("\nHTML     : ");
       int e = scan.nextInt();
       System.out.print("\nPC       : ");
       int f = scan.nextInt();
       
       if(a<40 || b<40 || c<40 || d<40 || e<40 || f<40 )
       {
          System.out.println("\n SORRY YOU ARE FAILED ! ");
       }
       else
       {
          int total = a+b+c+d+e+f;
          float per =(float) total/6;
          int k = (int)per/10;
          
          System.out.println("TOTAL MARKS   : "+total);
          System.out.println("PERCENTAGE    : "+per);
          System.out.print("YOUR GRADE IS : ");
          switch(k)
          {
           case 9: 
              {
                  System.out.println("A+");
                  break;
              }
              
           case 8: 
              {
                  System.out.println("A");
                  break;
              }
              
           case 7: 
              {
                  System.out.println("B+");
                  break;
              }
              
           case 6: 
              {
                  System.out.println("B");
                  break;
              }
              
           case 5: 
              {
                  System.out.println("C");
                  break;
              }
              
           case 4: 
              {
                  System.out.println("D");
                  System.out.println("BACH GAYA TU BETA");
                  
                  break;
              }
          }
          
       }
       
     }
     
   }
