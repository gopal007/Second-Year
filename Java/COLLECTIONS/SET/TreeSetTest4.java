 
 import java.util.*;
 
 class TreeSetTest4
 
 {
	 public static void main(String args[])
	 {
		 TreeSet <Integer> ts = new TreeSet <Integer> ();
		 
		 ts.add(1);
		 ts.add(7);
		 ts.add(3);
		 ts.add(20);
		 ts.add(5);
		 ts.add(15);
		 ts.add(2);
		 ts.add(8);
		 ts.add(9);
		 ts.add(4);
		 
		 SortedSet subset = ts.subSet(3,8 );       // IN THIS METHOD FROM ELE. IS INCLUSIVE AND TO ELE. IS EXCLUSIVE......
		 System.out.println(subset);
		 System.out.println();
		 
		 SortedSet tailSet = ts.tailSet(5);         //   returns the elements that are greater than the given ele(inclusive).....
	     System.out.println(tailSet);
		 System.out.println();
		 
		 SortedSet headSet = ts.headSet(7);         //   returns the ele which are strictly less than to ele.........
		 System.out.println(headSet);
		 System.out.println();
		 
		 System.out.println(ts.floor(10));          // floor() returns the element that is less than or equal to given ele .     ans <= e.......
		 System.out.println();
		 
		 System.out.println(ts.ceiling(10));          //  ceiling() returns ele that is just greater or equal to the ele......
		 System.out.println();

				 
	 }
 }
		 
		 