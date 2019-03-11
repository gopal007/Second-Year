import java.util.*;
class ArrayListTest2
  {
  public static void main(String args[])
  { 
    ArrayList<Integer> al1=new ArrayList<Integer> (/* Int INITIAL CAPACITY  */);
	
	al1.add(45);
	al1.add(52);
	al1.add(100);
	al1.add(78);
	al1.add(100);
	
	int a=al1.get(0);                                     //  GETS THE VALUE OF OBJECT AT THE GIVEN INDEX
	int b=al1.get(1);
	int c=al1.get(2);
	int d=al1.get(3);
	int e=al1.get(4);

	
	
	System.out.println(a);
	System.out.println(b);                                 //CAPACITY OF ARRAYLIST CANNOT BE PRINTED
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println();

	al1.remove(new Integer(100));                          //REMOVES THE ELEMENT MENTIONED THAT OCCURS FOR FIRST TIME
	
	for(Integer g:al1)
	{
		System.out.println(g);
	}
	System.out.println();
	al1.remove(1);                                         //REMOVES THE ELEMENT AT THE GIVEN INDEX
	
	for(Integer g:al1)
	{
		System.out.println(g);
	}
	
	System.out.println("CURRENT SIZE OF ARRAYLIST IS : "+al1.size()); // PRINTS SOZE OF ARRAYLIST
   }
   }
                                                          