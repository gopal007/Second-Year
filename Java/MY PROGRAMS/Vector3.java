// Java code illustrating addAll()
import java.util.*;
class Vector3    
{
    public static void main(String[] arg)
    {
       ArrayList arr = new ArrayList();
       arr.add(3);
       arr.add("geeks");
       arr.add("forgeeks");
       arr.add(4);
       
      
        // createn default vector
        Vector v = new Vector(10);
        
        v.add(2);
        // copying all element of array list int0 vector
        v.addAll(0, arr);
        
        // checking vector v
        System.out.println("vector v:" + v);
     } 
}