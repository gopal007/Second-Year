  // UNLIKE LIST HASH DO NOT CONTAIN DUPLICATES........
  // HashSet is homogenous collection......
  //  initial capacity is 16 and load factor 0.75
  // 1.void clear()    2.boolean isEmpty()
  
  import java.util.*;
  
  class HashSetTest1
  {
	  public static void main(String hashset[])
	  {
		  HashSet <Integer> hs = new HashSet<Integer> ();
		  hs.add(10);
		  hs.add(20);
		  hs.add(30);
		  hs.add(40);
		  hs.add(50);
		  hs.add(60);
		  hs.add(70);
		  
		  boolean b = hs.contains(30);             //   boolean contains()...........
		  System.out.println(b);                   //  does not print the element in order but according to logic of 16.....
		  
		  hs.remove(30);                            // remove(o);    removes the element from the set.......
		  System.out.println(hs);
		  
		  int s = hs.size();
		  System.out.println("SIZE : "+s);
		  
		  Iterator<Integer> itr=hs.iterator();      //returns an iterator over the elements of the set......
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  
		  
	  }
  }
  