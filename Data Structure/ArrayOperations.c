#include<stdio.h>

int main()
{
	int arr[50],j,i,n,key,location=-1,operation,temp;
	char ch;
	printf("\nEnter how many elements in array : ");
	scanf("%d",&n);
	
	printf("\nEnter elements of array : ");
	for(i = 0;i < n ; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nWhat operation you want to perform on array : ");
	printf("\n 1. = INSERT A ELEMENT \t 2. = INSERT ARRAY \t 3. = DELETION ELEMENT \t 4. = SORT ASCENDING \t 5. = SEARCHING \t 6. = TRAVERSING \n");
	scanf("%d",&operation);

switch(operation)
{

case 1 :
{

	printf("\nEnter the element you want to insert in array : ");
	scanf("%d",&key);
	printf("\nEnter the location you want to insert element in array : ");
	scanf("%d",&location);
	location -= 1;

	for(i = (n+1); i > location ; i--)
	{
		arr[i] = arr[i-1];
	}
	arr[location] = key;

	printf("\nArray after insertion of element  : ");
	for(i = 0;i < (n+1) ; i++)
	{
		printf("%d ",arr[i]);
	}
	break;
}

case 2 :
{

	int num;
	printf("\nWHAT IS THE LENGTH OF ARRAY THAT YOU WISH TO INSERT : ");
	scanf("%d",&num);
	int arr1[num];
	printf("\nENTER ELEMENTS OF THE ARRAY THAT YOU WANT TO INSERT : ");
	for(i = 0;i < num ; i++)
	{
		scanf("%d",&arr1[i]);
	}
	
	printf("\nEnter the location you want to insert element in array : ");
	scanf("%d",&location);
	location -= 1;

	for(i = (n+num); i > location ; i--)
	{
		arr[i] = arr[i-num];
	}
	
	for(i = 0; i < num ; i++)
	{
		arr[location] = arr1[i];
		location++;
	}

	printf("\nArray after insertion of element  : ");
	for(i = 0;i < (n+num) ; i++)
	{
		printf("%d ",arr[i]);
	}
	break;
}

case 3 :
{

	printf("\nEnter the element you want to delete from array : ");
	scanf("%d",&key);

	for(i = 0;i < n ; i++)
	{
		if(key == arr[i])
		{
			location = i;
		}
	}
	
	if(location == -1)
	{
		printf("\n%d element is not present in Array \n",key);
	}
	else
	{
		for(i = location;i < n ; i++)
		{
			arr[i] = arr[i+1];
		}

		printf("\nArray after deletion of element  : ");
		for(i = 0;i < (n-1) ; i++)
		{
			printf("%d ",arr[i]);
		}
	}
	break;
}


case 4 :
{

	for (i = 0; i < n-1; i++)      
	{
		for (j = 0; j < n-i-1; j++) 
		{
			if (arr[j] > arr[j+1])
			{
				 temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp;
			}
		}
	}

	printf("\nArray after sorting of element  : ");
	for(i = 0;i < n ; i++)
	{
		printf("%d ",arr[i]);
	}
	break;
}


case 5 :
{

	printf("\nEnter the element you want to Search in array : ");
	scanf("%d",&key);

	for(i = 0;i < n ; i++)
	{
		if(arr[i] == key )
		{
			location = i;
		}
	}
	if(location == -1)
	{
		printf("\n%d element is not present in Array \n",key);
	}
	else
	{
		printf("\nelement %d is at %d location  \n",key,location+1);
	}
	break;
}

case 6 :
{

	for(i = 0;i < n ; i++)
	{
		printf("\nelement %d is = %d  \n",i+1,arr[i]);

	}
	break;
}

default :
{
	printf("\n INVALID CHOICE OF OPERATION ");
	break;
}

}
}