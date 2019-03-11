/*   
                                                   *   ARRAYLIST CAN ADD ANY TYPE OF DATA UNLESS DATA TYPE IS MENTIONED 
*/
import java.util.*;

class ArrayListTest1
 {
  public static void main(String args[])
   {
    ArrayList<Object> al=new ArrayList<Object>(); //   ARRAYLIST HAS INTIAL CAPACITY OF 10
	al.add(10);
    al.add(10);                                    //   ARRAY LIST ALLOWS DUPLICATES	
    al.add('A');	
	al.add(74.5);
	al.add("Gopal");
	al.add(true);
	System.out.println(al);
	al.add(2,90);                                    //  ADDS ELEMENT AT SECOND INDEX
    System.out.println(al);
    al.remove(0);                                    //  REMOVES THE ELEMENT FROM GIVEN INDEX
    System.out.println(al);
    /*
	                                                 THIS METHOD a=al.get(3);
													 IS ONLY ALLOWED FOR ARRAYLIST OF SAME DATA TYPE
	*/
	
	
	for(Object e:al)                               // ENHANCED FOR-LOOP 
	{
	System.out.println(e);
	}

   }
 }
                                                   //  ARRAYLIST PRESERVES ORDER
                                                   //  ARRAYLIST IS INDEX BASED
 