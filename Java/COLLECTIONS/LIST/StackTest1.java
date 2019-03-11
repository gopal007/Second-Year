  // STACK IS SUB TYPE OF VECTOR...
  //  STACK FOLLOWS  L.I.F.O. ORDER....
  
  
  import java.util.*;
  
  class StackTest1
  {
	  public static void main(String gopal[])
	  {
		  Stack<String> SS = new Stack<String> ();
		  
		  SS.push("GOPAL");        // push() method is used to insert the object...
		  SS.push("JAVA");
		  SS.push("C++");
		  SS.push(".NET");
		  
		  System.out.println(SS);
		  
		  SS.pop();                // pop()  method is used to remove the last object....
		  System.out.println(SS);
		  
		  SS.push(".NET");
		  
		  System.out.println(SS.empty());   // empty() returns true if stack is empty....
	      
		  System.out.println(SS.peek());    //peek() reads the element at the top ....
		  
		  int a = SS.search("GOPAL");       // search(E) returns its offset from top.... 
		  System.out.println(a);
	  
	  }
  }
  
		  