  // LIKE ITERATOR ; ENUMERATION IS ALSO FORWARD ONLY CURSOR
  // ENUMERATION IS READ ONLY,ENUMERATION HAS NO METHOD FOR GETTING INDEX.
  //  Enumeration has only 2 methods  1. boolean hasMoreElements()   &   2.  object  nextElement()
  
  import java.util.*;
  
  class VectorTest2
  {
	  public static void main(String args[])
	  {
		  Vector <Integer> v= new Vector<Integer> ();   // Constructor
		  
		  v.add(10);
		  v.add(20);
		  v.add(15);
		  v.add(100);
		  
		  Enumeration<Integer> a=v.elements();
		  
		  while(a.hasMoreElements())
		  {
			  System.out.println(a.nextElement());
		  }
	  }
  }