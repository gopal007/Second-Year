  // CLONIG METHOD FOR HASHSET.......
  
  import java.util.*;
  class HashSetClone
  {
     public static void main(String args[])
	 
	 {
	 
	 HashSet<Integer> hs1 = new HashSet<Integer> ();
	 HashSet<Integer> hs2 = new HashSet<Integer> ();
	 
	 hs1.add(20);
	 hs1.add(30);
	 hs1.add(50);
	 hs1.add(60);
	 hs1.add(100);
	 
	 hs2=(HashSet)hs1.clone();
	 
	 System.out.println(hs2);
	 }
  }
	 