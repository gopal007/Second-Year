   // Jagged Array....  FOR Nth ROW HAVING N ELEMENTS OF NATURAL NUMBERS....
    import java.util.Scanner;
	import java.util.Arrays;
	
   class JaggedArray1
   {
	   public static void main(String []p)
	   throws Exception
	   {
		   System.out.println("INPUT HOW MANY ROWS : ");
		   Scanner scan = new Scanner(System.in);
		   int r = scan.nextInt();
		   
		   int arr[][] = new int[r][];
           int count = 1;		   
		   
		   for (int i=0; i<arr.length;i++)
			   arr[i] = new int[i+1];
		   for( int i = 0 ; i < arr.length ; i++)
		   {
			   for(int j = 0; j < arr[i].length; j++ )
			   {
				   arr[i][j] = count++;
			   }
		   }
			
			System.out.println("JAGGED ARRAY IS : ");
			
			/*for(int i =0 ; i < arr.length ; i++)
			{
				for(int j = 0 ; j < arr[i].length ; j++)
				{
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			*/
			
			System.out.println(Arrays.deepToString(arr));
			
	   }
	   
   }
		   
		   
		   
		   