    // jagged array is array of arrays......
	
	class JaggedArray
	{
		public static void main(String [] p)
		{
			
			int arr[][]  = new int[10][];     // CREATING JAGGED ARRAY.....
			
		    arr[0] = new int[1];          // FIRST ROW HAS 1 ELEMENT....
			arr[1] = new int[2]; 
			arr[2] = new int[3]; 
			arr[3] = new int[4]; 
			arr[4] = new int[5]; 
			arr[5] = new int[14]; 
			arr[6] = new int[7]; 
			arr[7] = new int[8]; 
			arr[8] = new int[9]; 
			arr[9] = new int[10]; 
			
		 
			int count = 1;
			for(int i=0; i < arr.length ; i++)
				for(int j=0; j < arr[i].length;j++)
				{
					arr[i][j] = count++;
				}
				
				
			System.out.println("ELEMENTS OF JAGGED ARRAY ARE : ");
			
			for( int i=0;i<arr.length;i++)
			   {
				    for(int j=0;j<arr[i].length;j++)
					   {
						   System.out.print(arr[i][j] + " ");
					   }
						   System.out.println();
					   
			   }	
			   
		}
		
	}