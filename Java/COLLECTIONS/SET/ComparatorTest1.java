   // COPARATOR.....
   
   import java.util.*;
   
   class Student
   
   {
	   private int rno;
	   private String name;
	   private double percentage;
	   
	   Student(int rno,String name,double percentage)
	   {
		   this.rno = rno;
		   this.name = name;
		   this.percentage = percentage;
	   }
	   
	   int getRno()
	   {
		   return rno;
	   }
	   
	   int setId(int id)
	   {
		   this.id=id;
	   }
	   
	   String getName()
	   {
		   return name;
	   }
	   
	   String setName(String name)
	   {
		   this.name = name;
	   }
	   
	   double getPercentage()
	   {
		   return percentage;
	   }
	   
	   double setPercentage(double percentage)
	   {
		   this.percentage = percentage;
	   }
	   
	   public double compare(Object o1,Object o2)
	   
	   {
		   double p1 = ((Student)o1).getPercentage();
		   double p2 = ((Student)o2).getPercentage();
		   
		   if(p1 > p1)
			   return +1;
		   else
			   if(p1 < p2)
				   return -1;
		   else
               return 0;
	   }

   }
       class ComparatorTest1

	   {
            public static void main(String args[])
			{
				TreeSet <Student> ts = new TreeSet <Student> ();
				
				ts.add(new Student(1,"JAVA",98.45));
				ts.add(new Student(2,"C++",94.10));
				ts.add(new Student(3,"C",90.91));
				ts.add(new Student(4,"PHP",89.00));
				ts.add(new Student(5,"ORACLE",96.45));
				
				
			Iterator <Student> itr = ts.iterator();
			   while(itr.hasNext())
			    {
			     	System.out.println(itr.next());
			    }
			
	
			}
	   }
	   