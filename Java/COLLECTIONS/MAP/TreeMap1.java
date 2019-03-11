  //Natural order of sorting of keys in TreeMap is ascending......
  /*    METHODS OF TREEMAPS
    1. void clear()                          4. boolean containsValue(Object value)       7. Object get(Object key)            10. putAll(map)
	2. Object clone()                        5. Set entrySet()                            8. SortedMap headMap(Object toKey)   11. remove(key)
	3. boolean containsKey(Object key)       6. Object firstKey()                         9. Set keySet()
	*/
  
  import java.util.*;
  
  class TreeMap1
  
  {
	  public static void main(String args[])
	  {
		  TreeMap <Integer,String> tm = new TreeMap <Integer,String> ();
		  
		  tm.put(1,"GOPAL");
		  tm.put(99,"GOPAL");
		  tm.put(20,"GOPAL");
		  
		  System.out.println(tm);
		  System.out.println();
		  
		  System.out.println(tm.lastKey());      // returns the last key in sorted map.....
		  System.out.println();
		  
		  


		  
	  }
  }	  
		  
		  