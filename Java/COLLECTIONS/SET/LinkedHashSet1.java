  // MAINTAINS ORDER OF CLLECTION .....
  //  LinkedHashSet(int capacity,float load capacity)
  /*
        COMON METHODS OF SET ARE 
		1.  add()            4.  isEmpty()        7.  size()
		2.  clear()          5.  remove(obj)      8.  hashCode()
		3.  contains()       6.  iterator()
  */
  
  import java.util.*;
  
  class LinkedHashSet1
  
  {
	  public static void main(String args[])
	  
	  {
		  LinkedHashSet <Integer> lhs = new LinkedHashSet <Integer> ();
		  
		  lhs.add(10);
		  lhs.add(20);
		  lhs.add(30);
		  lhs.add(40);
		  lhs.add(50);
		  lhs.add(60);
		  lhs.add(70);
		  lhs.add(80);
		  
		  
		  System.out.println(lhs);
		  System.out.println();
		  
		  
		  System.out.println(lhs.size());
		  
	  }
  }
  
  