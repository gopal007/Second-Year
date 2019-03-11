#include<stdio.h>

void main()
{
	int top=-1,key,i,size,operation;
	char ch;
	
	printf("\nWHAT SIZE OF STACK DO YOU WANT : ");
	scanf("%d",&size);
	int arr[size];
Read :
{
	printf("\nWHAT OPERATION DO YOU WANT TO PERFORM :\n");
	printf("1. = PUSH \t2. = POP \t3. = PEEK \t4. ISEMPTY \n");
	scanf("%d",&operation);

switch(operation)
{
case 1 :
	{
		if(top == size)
		{
			printf("\nOVERFLOW CONDITION OCCURED...CANNOT PUSH THE ELEMENT ");	
		}
		else
		{
			printf("\nENTER THE ELEMENT TO PUSH : ");
			scanf("%d",&key);
			top = top + 1;
			arr[top] = key;
		}
		
	Ask :
	{
		printf("\nDO YOU WISH TO PERFORM ANOTHER OPERATION(Y/N) :");
		scanf("%s",&ch);

		if(ch == 'y' || ch == 'Y')
		{
			goto Read;
		}
		else
		{
			goto Print;
		}
	}
		break;
	}

case 2 :
	{
		if(top == -1)
		{
			printf("\nUNDERFLOW CONDTION OCCURED...CANNOT POP THE ELEMENT ");
		}
		else
		{
			top -= 1;
		}

		goto Ask;
		break;
	}

case 3 :
	{
		if(top == -1)
		{
			printf("\nSTACK IS EMPTY... ");
		}
		else
		{
			printf("\nTOP ELEMENT OF STACK IS : %d ",arr[top]);
		}

		goto Ask;
		break;
	}

case 4 :
	{
		if(top == -1)
		{
			printf("\nTRUE.... STACK IS EMPTY ");
		}
		else
		{
			printf("\nFALSE... STACK IS NOT EMPTY ");
		}

		goto Ask;
		break;
	}

default :
	{
		Print :
		{

		if(top == -1)
		{
			printf("\nSTACK IS EMPTY...\n");
		}
		else
		{
		for(i = top;i >= 0;i--)
		{
			printf("\n%d ELEMENT IS : %d\n",i+1,arr[i]);
		}}
		}
		break;
	}

}
}
}
