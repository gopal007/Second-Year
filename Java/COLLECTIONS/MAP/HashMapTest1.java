   //  HashMap allows null keys and null values.....
   //  It does not gurantee that order of collection will remain same.....
   //  duplicate keys are not allowed but duplicate values are allowed....
        /*   methods of hashmap 
        1. void clear()              4. boolean isEmpty()      7. Set keySet()           10. int size()
		2. boolean containsKey()     5. Object clone()         8. Object put(K,V)
		3. boolean containsValue()   6. Set entrySet()         9. Collection values()
		*/
   
   import java.util.*;
   
   class HashMapTest1
   
   {
	   public static void main(String args[])
	   
	   {
		   HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		   
		   hm.put(1,"GOPAL");
		   hm.put(2,"NILESH");
		   hm.put(3,"GITESH");
		   hm.put(4,"VAIBHAV");
		   hm.put(10,"JAVA");
		   
		   System.out.println(hm);
		   System.out.println();

		   
		   Set <Integer> keys = hm.keySet();
		   System.out.println(keys);
		   System.out.println();
		   
		   Collection <String> values = hm.values();
		   System.out.println(values);
		   System.out.println();
		   
		   System.out.println(hm.get(5));
		   }
   }
   