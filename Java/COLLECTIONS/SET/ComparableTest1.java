     //   COMPARABLE CAN COMPARE ONLY ONE TYPE EITHER INT OR STRING OR FLOAT....    
	 
	 
	import java.util.*;
	
	class Student implements Comparable
	
	{
		private int rno;
		private String name;
		
	    Student (int rno,String name)
		
		{
			this.rno = rno;
			this.name = name;
		}
		
		int getRno()
		{
			return rno;
		}
		String getName()
		{
		return name;
		}
		
		//     COMPARING
		public int compareTo(Object O)
		{
			Student s = (Student)O;
			// @overriding
			if(rno > s.rno)
				return -1;
			
			else
				if(rno < s.rno)
					return +1;
				
			else
				return 0;
		}
	}
	
	class ComparableTest1
	
	{
		public static void main(String gops[])
		
		{
			TreeSet <Student> ts = new TreeSet <Student> ();
			
			Student s1 = new Student (3,"GOPAL");
			Student s2 = new Student (4,"GITESH");
			Student s3 = new Student (1,"NILESH");
			
			ts.add(s1);
			ts.add(s2);
			ts.add(s3);
			
			
			      // Iterator<Student> itr = ts.iterator();+
				   
                   //while(itr.hasNext())
					   
				   for (Student s : ts)
				   {
					  // Student s = itr.next();
					   System.out.println("ROLL NO : "+s.getRno());
					   System.out.println("NAME    : "+s.getName());
					   System.out.println();
				   }
		}
	}
				   
			
			
			
		