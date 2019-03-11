import java.util.Scanner;	

class Sort
	{
	public static void main(String [] p)
		{
			Scanner scan = new Scanner(System.in);
			int temp=0;
			
			System.out.println("HOW MANY NUMBERS : ");
			int n = scan.nextInt();
			
			System.out.println("ENTER INTEGERS");
			int arr[] = new int[n];
			for(int i =0 ; i < n ; i++)
				{
				  arr[i] = scan.nextInt();
				}
				
			// sort ascending
			for(int i =0 ; i < n ; i++)
			{
			for(int j =1; j < (n-i) ;  j++)
				{
					if(arr[j-1] > arr[j])
					{
					  temp = arr[j-1];
					  arr[j-1] = arr[j];
					  arr[j] = temp;
					}
					
				}
			}
			System.out.print("\n\nASCENDING ORDER OF ELEMENTS IS : ");
			for(int i =0 ; i < n ; i++)
				{
				 System.out.print(arr[i]+" ");
				}
				
			// sort descending
			for(int i =0 ; i < n ; i++)
			{
			for(int j =1; j < (n-i) ;  j++)
				{
					if(arr[j-1] < arr[j])
					{
					  temp = arr[j-1];
					  arr[j-1] = arr[j];
					  arr[j] = temp;
					}
					
				}
			}
			System.out.print("\n\nDESCENDING ORDER OF ELEMENTS IS : ");
			for(int i =0 ; i < n ; i++)
				{
				 System.out.print(arr[i]+" ");
				}
		}	
	}