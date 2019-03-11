   //  OVERRIDDING equals() METHOD..........
   
   class A
   {
	   int x;
	   public boolean equals(int x)
	   {
		   A a= new A();
		   
		   if(this.x==a.x)
		      return true;
		   
		   else
			  return false;
	   }
   }
   
   class EqualMethodInSet2
   {
	   public static void main(String eats[])
	   {
		   A obj1 = new A();
		   A obj2 = new A();
		   A obj3 = new A();
		   
		   
		   obj1.x = 10;
		   obj2.x = 10;
		    
		boolean b = obj1.equals(obj2);
		
		System.out.println(b);
		
		obj3=obj1;                         // hashCode() method get overrided as hashcode of both object will be same.......
		
		b = obj3.equals(obj1);
		
		System.out.println(b);
		System.out.println(obj3.hashCode());
		System.out.println(obj1.hashCode());

	   }
   }