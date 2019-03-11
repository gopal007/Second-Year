      import java.util.*;
	  
	  class TreeSetTest3
	  
	  {
		  
		  public static void main(String args[])
		  
		  {
			  
			TreeSet <String> ts1 = new TreeSet <String> ();
			TreeSet <String> ts2 = new TreeSet <String> ();
			
			ArrayList <Object> al = new ArrayList <Object> ();
			
			ts1.add("JAVA");
			ts1.add("C++");
			ts1.add("GOPAL");
			
			ts2.add("C");
			ts2.add("ORACLE");
			ts2.add("NILESH");
			
			ts1.addAll(ts2);              // addAll() is method of set interface that adds the element of second set in first.....
			System.out.println(ts1);

			System.out.println();
			System.out.println(ts1.containsAll(ts2));  //containsAll() is boolean method . it checks if all elements of 2nd set are PRESENT in 1st or NOT
			
			System.out.println();
			System.out.println(ts1.hashCode());    
			System.out.println(ts2.hashCode());
			
			System.out.println();
			ts1.retainAll(ts2);        //retainAll() removes all the elements from 1st set that are not present in 2nd......
			System.out.println(ts1);
			System.out.println();
			
			
			String Arr[] = new String [ts1.size()];      //  Array initialization.....
			
			ts1.toArray(Arr);                            // toArray(set) method copys all the the elements from set to array...
			System.out.println(Arr);       // prints the address...
			System.out.println();
			
			for(int i=0;i<ts1.size();i++)
			{
			System.out.println(Arr[i]);
			}
			
		  }
	  }
	  
	  