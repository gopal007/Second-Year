  /* LINKED-LIST (efficient in insertion and deletion)....
    * linkedlist can efficientally act as stack,queue OR double-ended-queue...
   */
   
   import java.util.*;
   
   class LinkedListTest1
   {
	   public static void main(String args[])
	   {
		   LinkedList <Integer> ll=new LinkedList<Integer> ();
		   ll.add(10);
		   ll.add(20);
		   ll.add(30);
		   ll.add(40);
		   ll.add(50);
		   ll.add(60);
		   ll.add(50);
		   ll.add(80);
		   ll.add(50);
		   
		   int g;
		   g=ll.get(3);               //RETURNS THE ELEMENT AT GIVEN INDEX...
		   
		   System.out.println(g);    // linkedlist preserves insertion order...
		  
		  
		   ll.add(2,1000);           //  ADDS THE OBJECT AT GIVEN INDEX...
		   System.out.println("ADDS 1000 AT INDEX=2...");
		   System.out.println(ll);
		   System.out.println();

		   ll.addFirst(2000);         //ADDS THE OBJECT AT FIRST PLACE...
		   System.out.println("ADDS 2000 AT FIRST PLACE");
           System.out.println(ll);
		   System.out.println();

		   
		   ll.addLast(3000);         // ADDS THE ELEMENT AT LAST INDEX...
		   System.out.println("ADDS 3000 AT THE ENDING");
		   System.out.println(ll);
		   System.out.println();

		   ll.remove(new Integer(50));             //REMOVES THE FIRST OCCURENCE OF OBJECT...          
		   System.out.println("REMOVES 50s FIRST OCCURENCE IN THE LIST");
		   System.out.println(ll);
		   System.out.println();

		   
		   System.out.println("RETURNSTRUE IF 99 EXIST");
		   System.out.println(ll.contains(99));  //returns true if element exist in the list...
		   System.out.println();
		   		   
				   
		   System.out.println("USING getFirst");
		   System.out.println(ll.getFirst());    // returns first element....
		   System.out.println();
		   
		   System.out.println("USING getlast");    
		   System.out.println(ll.getLast());     //GETS THE LAST ELEMENT....
		   System.out.println();
		   
		   System.out.println("GETTING INDEX OF 50");
		   System.out.println(ll.indexOf(50));       // GETS INDEX OF ELEMENTS FIRST OCCURENCE....
		   System.out.println();
		   
		   System.out.println("LAST INDEX OF 50");
		   System.out.println(ll.lastIndexOf(50));      //GETS INDEX OF ELEMENTS LAST OCCURENCE.....
		   System.out.println();
		   
	   }
   }
		   
  