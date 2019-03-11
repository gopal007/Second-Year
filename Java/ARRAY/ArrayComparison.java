import java.util.Arrays;       // to use arrays.equals().........

  class ArrayComparison
    {
        public static void main(String []p)
		    {
                int []arr1 = {1,2,3,4,5};   
				int []arr2 = {1,2,3,4,5};
				
				System.out.println("COMPARING THE ARRAYS USING REF.(==).  ");
				
				if(arr1 == arr2)                            // same as arr1.equals(arr2)
					System.out.println("EQUAL");
				
				else
					System.out.println("NOT EQUAL");
				
				System.out.println();
				
				System.out.println("COMPARING THE ARRAYS USING VALUES (Arrays.equals()...).  ");
				
				if(Arrays.equals(arr1,arr2))
					System.out.println("EQUAL");
				
				else
					System.out.println("NOT EQUAL");
				
			}
			
	}
	
	/*
	   * Arrays.equals() is not able to do deepcomparison of arrays i.e. if arr. contains another array.
	   * To deep compare arr. use Arrays.deepEquals().....
	*/
				