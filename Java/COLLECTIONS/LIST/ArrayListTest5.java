
     //  LIST-ITERATOR
	 //   *  ListIterator is bidirectional it cn=an make changes in both direction either in forward or backward...
	 //   *  there are 2 more methods   1.  nextIndex()    2.  previousIndex.............................
	 
	 import java.util.*;
	 
	 class ArrayListTest5
	 {
	   public static void main(String args[])
	   {
		                                                         // Creat ArrayList and add elements to it...
	   ArrayList<String> list= new ArrayList <String> ();
		  list.add("JAVA");
		  list.add("ORACLE");
  		  list.add(".NET");
		  list.add("C++");
		  list.add("C#");

	  ListIterator<String> il=list.listIterator();

		  
		  System.out.println();
		  System.out.println("PRINTING ELEMENTS USING  next() method");
		  System.out.println();


          System.out.println(il.next());               // next() method reads next element in the list...
          System.out.println(il.next());               
          System.out.println(il.next());
          System.out.println(il.next());               
          System.out.println(il.next());               
		  
		  System.out.println();
		  System.out.println("PRINTING ELEMENTS USING previous() method ");
		  System.out.println();
		  
		  System.out.println(il.previous());           //previous() method reads previous element in the list...
		  System.out.println(il.previous());           
		  System.out.println(il.previous());          
		  System.out.println(il.previous());           
		  System.out.println(il.previous());          
		  
		  System.out.println();
		  System.out.println("PRINTING FORWARD ITERATION USING hasNext() & next() method :");
		  System.out.println();

	  while(il.hasNext())           //hasNext() method returns TRUE value if there exit element after current iterator...
		  {
			System.out.println(il.next());
		  }
		  
          System.out.println();
		  System.out.println("PRINTING BACKWARD ITERATION USING hasPrevious() & previous() method :");
		  System.out.println();
		  
      while(il.hasPrevious())  //hasPrevious() method returns TRUE value if there exit element before current iterator...  
		  {
			System.out.println(il.previous());
		  }

		  System.out.println();
		  System.out.println("PRINTING ARRAYLIST USING get() method :");
		  System.out.println();
		  
	  for(int i=0;i<list.size();i++)                 //  size() method reads the size of array list...
		  {
			  System.out.println(list.get(i));           //  get(i) method reads element at index i of array list...
		  }
		  
	  il.set("GOPAL");                      //replaces the last element returned by next() or previous() methods...
		  System.out.println();

		  
	   for(int i=0;i<list.size();i++)                 
		  {
			  System.out.println(list.get(i));          
		  }
		  
	  il.remove();               //removesthe last element returned by next() or previous() methods...          
		  System.out.println();
		  
      for(int i=0;i<list.size();i++)                 
		  {
			  System.out.println(list.get(i));          
		  }


		}
	 }