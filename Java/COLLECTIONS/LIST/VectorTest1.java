      //  VECTOR IS SYNCRONISED COLLECTION....
      //  Vector()   constructs empty vector with internal data array size 10 & and capacity increment 0....
	  //  Vector<Employee> v=new vector<Employee>(int initial capacity(default 10),initial capacity increment);
	import java.util.*;
	class Employee
	{
		private int empno;
		private float salary;
		
		Employee(int empno,float salary)
		{
			empno=empno;               //when instance variable and local variable have same name we have to use"this."
			this.salary=salary;             // if we dont use it then compiler uses it internally....
		}
		
		int getEmpno()
		{
			return empno;
		}
		
		float getSalary()
		{
			return salary;
		}
	}
	class VectorTest1
	{
		public static void main(String args[])
		{
			Vector<Employee> v=new 	Vector<Employee>(3);
			
			System.out.println(v.capacity());
			System.out.println(v.size());
			
			v.add(new Employee(1,10000));
			v.add(new Employee(2,11000));
			v.add(new Employee(3,9000));
			v.add(new Employee(4,15000));
			
			System.out.println();
			System.out.println("Capacity : "+ v.capacity());
			
			for(Employee g : v)
			{
				System.out.println(g.getEmpno()+" , "+g.getSalary());
				System.out.println();
			}
		}
	}