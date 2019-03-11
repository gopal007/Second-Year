import java.util.Arrays;
import java.util.Scanner;

class Calendar
{
	public static void main(String [] p )
	{
		String months[] = {"JANUARY","FEBBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		String days []  = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		int dates []    = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("\n\n\n\n\t\t\t\t\tYOU WILL NOW VIEW CALENDAR MADE BY GOPAL \n\n\n");
		System.out.println("ENTER THE YEAR FOR WHICH YOU WANT TO VIEW THE CALENDAR :");
		int year = scan.nextInt();
		
		
		
		if((year%4==0 &&year%100!=0)||year%400==0)
		{
			dates[1] = 29;
		}
		else
		{
			dates[1] = 28 ;
		}
		
		
		
		int q = year/28;
		int rem = year-(28*q);
		int space=0;
		
		
		
        switch(rem)
		{
			case 8 : 
			{
				space= 0;
				break;
			}
			
			case 9 : 
			{
				space= 2;
				break;
			}
			
			case 10 : 
			{
				space= 3;
				break;
			}
			
			case 11 : 
			{
				space= 4;
				break;
			}
			
			case 12 : 
			{
				space= 5;
				break;
			}
			
			case 13 : 
			{
				space=0 ;
				break;
			}
			
			case 14 : 
			{
				space= 1;
				break;
			}
			
			case 15 : 
			{
				space= 2;
				break;
			}
			
			case 16 : 
			{
				space= 3;
				break;
			}
			
			case 17 : 
			{
				space= 5;
				break;
			}
			
			case 18 : 
			{
				space= 6;
				break;
			}
			
			case 19 : 
			{
				space= 0;
				break;
			}
			
			case 20 : 
			{
				space= 1;
				break;
			}
			
			case 21 : 
			{
				space= 3;
				break;
			}
			
			case 22 : 
			{
				space= 4;
				break;
			}
			
			case 23 : 
			{
				space= 5;
				break;
			}
			
			case 24 : 
			{
				space= 6;
				break;
			}
			
			case 25 : 
			{
				space= 1;
				break;
			}
			
			case 26 : 
			{
				space= 2;
				break;
			}
			
			case 27 : 
			{
				space= 3;
				break;
			}
			
			case 0 : 
			{
				space= 4;
				break;
			}
			
			case 1 : 
			{
				space= 6;
				break;
			}
			
			case 2 : 
			{
				space= 0;
				break;
			}
			
			case 3 : 
			{
				space= 1;
				break;
			}
			
			case 4 : 
			{
				space= 2;
				break;
			}
			
			case 5 : 
			{
				space= 4;
				break;
			}
			
			case 6 : 
			{
				space= 5;
				break;
			}
			
			case 7 : 
			{
				space= 6;
				break;
			}
		}
		
		
		
		
		
		for(int i=0,c=0;i<months.length;i++)
		{
		   	
			System.out.printf("\n\n");
			System.out.println("                   "+months[i]+"   "+year);
			System.out.println("\n\n");
			
			for(int j=0;j<7;j++)
			{
				System.out.printf(days[j]+"\t");
				
			}
			
			System.out.println("\n\n");
			
			
			for(int j=1,count=0;j<=dates[i];j++)
			{
			   if(j==1)
				for(int s=1;s<=space;s++)
				{
					System.out.printf("\t ");
					count++;
				}
				
				System.out.printf(j+"\t");
				count++;
				if(count%7==0)
				{
					System.out.println("\n");
				}
				
				c=count;
				
			}
			 
			 
			space=(c%7);
			
					
			
		}
		
	}
	
}