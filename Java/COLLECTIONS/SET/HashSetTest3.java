      // SET DO NOT ALLOW DUPLICATES....
	  // retainAll() METHOD RETAINS ELEMENTS THAT EXIT IN BOTH SETS.....
	  
  import java.util.*;
  
  class HashSetTest3
  
  {
	  public static void main(String args[])
	  
	  {

	     HashSet<Integer> hs1 = new HashSet<Integer> ();
		 HashSet<Integer> hs2 = new HashSet<Integer> ();

		 
		 hs1.add(10);
		 hs1.add(20);
		 hs1.add(30);
		 hs1.add(40);
		 hs1.add(50);
		 hs1.add(60);
		 
		 hs2.add(30);
		 hs2.add(70);
		 hs2.add(50);
		 hs2.add(90);
		 hs2.add(10);
		 hs2.add(70);
		 
	
		 
		 System.out.println("ELEMENTS OF SET1 BEFORE ANY BULK/SET OPERATION :");
		 System.out.println(hs1);
		 System.out.println();
		 
         System.out.println("ELEMENTS OF SET2 BEFORE ANY BULK/SET OPERATION :");
		 System.out.println(hs2);
		 System.out.println();
		 
		
		 hs1.addAll(hs2);      		 // ADDS ELEMENTS OF SET2 IN SET1 ONLY IF THEY DO NOT EXIST ALREDY IN SET1....
		 System.out.println("ELEMENTS AFTER addAll METHOD ADDING SET2 IN SET1 IS : ");
		 System.out.println(hs1); 
		 System.out.println();
		 
		 
		 hs1.removeAll(hs2);          // REMOVES ELEMENTS OF SET2 FROM SET1 ONLY IF THEY DO EXIST ALREDY IN SET1....
		 System.out.println("ELEMENTS AFTER removeAll METHOD REMOVING SET2 FROM SET1 IS : ");
         System.out.println(hs1);
		 System.out.println();

		
         
		 System.out.println();
		
	  }
  }