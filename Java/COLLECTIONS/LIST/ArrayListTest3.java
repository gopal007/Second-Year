/*
  *  HOW TO ADD CUSTOM OBJECT
*/

import java.util.*;

class Student
{ 
  private int rno;
  private String name;
  
  Student (Integer rno,String name)                                 //constructor should have same name as of class
  {
    this.rno=rno;
	this.name=name;
	}
  
  int getRno()
  {
  return this.rno;
  }
  
   String getName()
  {
  return this.name;
  }
 }
 class ArrayListTest3
    {
	  public static void main(String args[])
	  {
	    ArrayList<Student> al=new ArrayList<Student> ();
		al.add(new Student(1,"Gopal"));
		al.add(new Student(2,"Gitesh"));
		al.add(new Student(3,"Nilesh"));
		
	for(Student e:al)
	{
	System.out.println(e);                                          //prints the type and address.
	System.out.println(e.getRno()+" , "+e.getName());
	}
	}}