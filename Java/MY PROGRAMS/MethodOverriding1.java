  //  METHIOD OVERRIDING.....
  
  class Parent 
  
  {
	  void walks()
	  {
		  System.out.println("PARENT WALKS");
	  }
	  
  }
  
  class Child extends Parent 
  
  
  {
	  void walks()
	  {
		  System.out.println(" CHILD WALKS");   
	  }
  }

   class MethodOverriding1
   {
       public static void main(String g[])
	   {
          Child a = new Child();
          a.walks();
	   }

   }	   