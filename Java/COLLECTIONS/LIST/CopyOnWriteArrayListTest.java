//  FAIL_SAFE ITERATORS
import java.util.*;
import java.util.concurrent.*;

  class CopyOnWriteArrayListTest                           //   Copy on write iterator makes copy of original collection 
  {                                                        //   so we can make changes to collection after creating iterator
    public static void main(String args[])                 //   without getting exceptions.
	{
	  CopyOnWriteArrayList <Integer> al = new CopyOnWriteArrayList <Integer> ();
	  al.add(10);
	  al.add(20);
	  al.add(30);
	  al.add(40);
	  
	  Iterator <Integer> i=al.iterator();           
	  al.add(50);                                         //HERE WE CAN SEE THAT OBJECT IS ADDED AFTER CREATING ITERATOR
	  
	  for(Integer g: al)
	  {
	  System.out.println(g);
	  }
	  }
	  }