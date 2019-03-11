  //  Equals() method returns the boolean value....
  //It is a method of object class...
  // By default equal method compares addresses of objects...
  
  class A 
  {
       int x;
  }
  
  class EqualMethodInSet1
  {
	  public static void main(String sleep[])
	  {
		  A object1=new A ();
		  A object2=new A ();
		  A object3=new A ();
		  
		  object1.x=10;
		  object2.x=10;
		  
		  boolean b = object1.equals(object2);   // as equals() method is not over rided it compares addresses
		                                         //thus it will return false......
		  System.out.println(b);
		  
		  object3=object1;                       // address of object1 gets stored in object3..........
		  b = object1.equals(object3);            // as addresses are same it returnstrue......
		  
		  System.out.println(b);
		
		  
	  }
	  
  }