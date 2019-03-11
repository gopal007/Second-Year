/*
  *ITERATOR IS A CURSOR.  
  *ITERATOR DOES NOT PROVIDE METHOD TO FIND INDEX.
  *ITERATOR IS PRESENT IN java.util.concurrent package.
  *ITERATORHAS ONLY 3 METHODS
  1-boolean hasNext
  2-next
  3-void remove
*/

import java.util.*;

class ArrayListTest4
{  public static void main(String args[])
   {
     ArrayList<Integer> al=new ArrayList<Integer> ();
	 
	 al.add(23);
	 al.add(78);
	 al.add(87);
	 al.add(90);
	 al.add(05);
	 
	Iterator<Integer> i=al.iterator();          /*ONCE ITERATOR IS INITIATED NO CHANGE CAN BE MADE TO COLLECTION
	                                             YOU CANT ADD OR REMOVE THE ELEMENT*/
	while(i.hasNext())                         //hasNext returns true if iterator has more elements.
	{
	  int a=i.next();                          //next   returns the next element in th iterator.
	  System.out.println(a);
	}
   }
}