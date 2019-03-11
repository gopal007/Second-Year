// USE OF ARRAY CLASS......
// Arrays.fill(arr,0,5,777)....   Arrays.fill(arr,777).....
// Arrays.deepToString(arr)...does not work for primitive types....
// Arrays.equals(arr1,arr2)

import java.util.Arrays;

  class ArrayClass
  {
     public static void main(String []p)
	  {
	     
		 int arr[] = {1000,75,845,007,921,425,122,1999,500,781,546,852,753,159};          // FOR PRINTING THE ARRAY ON SINGLE LINE...........
		 int arr4[][] = new int[2][5];
		 
		 System.out.println(Arrays.toString(arr) + "\n");
		 
		 Arrays.sort(arr ,0,5);
		 System.out.println("SORTED ARRAY FROM 0 TO 4 INDEX : \n" + Arrays.toString(arr));
		 
		 Arrays.sort(arr);
		 System.out.println("\nCOMPLETLY SORTED ARRAY : " + Arrays.toString(arr));
		 
		 int Index = Arrays.binarySearch(arr,845);
		 System.out.println("\nINDEX OF 845 IN SORTED ARRAY IS : " + Index + " ");
		 
		 int [] arrcopy = Arrays.copyOf(arr,arr.length);
		 System.out.println("\nCOPIED ARRAY IS : " + Arrays.toString(arrcopy));
		 
		 
		 int [] arrcopyrange = Arrays.copyOfRange(arrcopy,3,10);
		 System.out.println("\n COPIED ARRAY OF RANGE FROM 3 TO 10 : \n" + Arrays.toString(arrcopyrange));
		 
		 for(int [] row : arr4)
		 {
			 Arrays.fill(row , 9);
		 }
		 
		 System.out.println("\n FILLED 2D ARRAY : " + Arrays.deepToString(arr4));
	  }
	  
  }