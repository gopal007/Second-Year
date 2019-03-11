#include<stdio.h>

void main()
{
	int arr[50];
	int n,i,key,location;
	
	printf("\n What size of array you need : ");
	scanf("%d",&n);
	
	printf("\n Enter %d INTEGERS : ",n);
	
	for(i=0 ;i<n ;i++ )
	{
		scanf("%d",&arr[i]);
	}

	printf("\n Enter the INTEGER you want to insert : ");
	scanf("%d",&key);
	
	printf("\n Enter the LOCATION you want to it : ");
	scanf("%d",&location);
	location = location-1;
	
	for(i = n-1 ; i >= location ; i--)
	{
		arr[i+1] = arr[i];
	}
	arr[location] = key ;
	
	
	printf("\n\n");
	for(i=0 ;i < n+1 ;i++ )
	{
		printf("%d ",arr[i]);
	}
	
}