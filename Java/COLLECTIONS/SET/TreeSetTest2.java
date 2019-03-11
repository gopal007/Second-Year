 
 import java.util.*;
  
  class TreeSetTest2
  {
	  public static void main(String args[])
	  {
		  TreeSet<Integer> ts1 = new TreeSet<Integer> ();
		  TreeSet<Integer> ts2 = new TreeSet<Integer> ();
		  TreeSet<Integer> ts3 = new TreeSet<Integer> ();

		  
		  ts1.add(200);
		  ts1.add(20);
		  ts1.add(300);
		  ts1.add(40);
		  ts1.add(50);
		  
		  ts2.add(60);
		  ts2.add(70);
		  ts2.add(80);
		  ts2.add(90);
		  ts2.add(100);
		  ts2.add(111);
		  
		  
		  System.out.println("ELEMENTS OF SET1 ARE : ");
          System.out.println(ts1);
          System.out.println();	
		  
		  
		  System.out.println("ELEMENTS OF SET2 ARE : ");
          System.out.println(ts2);
          System.out.println();
		  
		  
		  System.out.println("ELEMENTS OF SET3 AFTER CLONING FROM SET 1 : ");
          System.out.println(ts3);
          System.out.println();	
		  
		  
		  System.out.println("AFTER USING last() METHOD ON SET 1");		       // last() gives the biggest element......  
          System.out.println(ts1.last());		  


          System.out.println("AFTER USING clear() METHOD ON SET 1 :");	
          ts1.clear();		                                            // clear() removes all the elements present in the set......
          System.out.println("ELEMENTS OF SET 1 ARE : "+ts1);		  
          System.out.println();	


          System.out.println("AFTER USING empty() ON SET 1 ");		  
          System.out.println(ts1.isEmpty());		                        // isEmpty()   is a boolean method.......
          System.out.println();		

          System.out.println("SIZE OF SET 1 IS : "+ts1.size());	               // size() returns the size of set........	  
          System.out.println();		  
          System.out.println("SIZE OF SET 2 IS : "+ts2.size());	
		  
		  }
		  }