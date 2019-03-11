import java.util.*;
  
  class TreeSetClone
  {
	  public static void main(String args[])
	  {
		  TreeSet<Integer> ts1 = new TreeSet<Integer> ();
		  TreeSet<Integer> ts2 = new TreeSet<Integer> ();

		  
		  ts1.add(200);
		  ts1.add(20);
		  ts1.add(300);
		  ts1.add(40);
		  ts1.add(50);
		  
		  ts2=(TreeSet)ts1.clone();
		  
		  
		  System.out.println("ELEMENTS OF SET1 ARE : ");
          System.out.println(ts1);
          System.out.println();	
		  
		  
		  System.out.println("ELEMENTS OF CLONE SET 2 ARE : ");
          System.out.println(ts2);
          System.out.println();
		  
	  }
  }