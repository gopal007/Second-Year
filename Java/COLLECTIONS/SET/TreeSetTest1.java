  //  TREE SET MAINTAINS ASCENDING ORDER......
  
  import java.util.*;
  
  class TreeSetTest1
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
		 
		  
          System.out.println("AFTER USING THE FUNCTION contains(60) ON SET1 AND SET2 :");		  
          System.out.println(ts1.contains(60));		  
          System.out.println(ts2.contains(60));
          System.out.println();		  


          System.out.println("SET2 AFTER USING remove(110) METHOD ON SET2");
          ts2.remove(111);		  
          System.out.println(ts2);		  
          System.out.println();		  
		  
		 
		  
          System.out.println("AFTER USING first() METHOD ON SET 1 ");		  // first() GIVES LOWEST ELEMENT OF SET.... 
          System.out.println(ts1.first());		  
          System.out.println();		  

		  
          	  
		  

	  }
  }
		  
		  
		  
		  