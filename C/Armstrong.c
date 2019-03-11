#include<stdio.h>

void main()
{
	int n,num,i,count=0, r, sum=0,p;
	
	printf(" Enter +ve Integer to check wheather it is armstrong : \n");
	scanf("%d",&n);
	num = n ;
	
	for(n ; n>0; )
	{
		n=n/10;
		count++;
		
	}
	
	n = num ;
	while(n > 0)
	{	
		p=1;
		r = n%10;
		for(i=1; i <= count ; i++)
		{
			p = p*r;
		}
		n = n/10;
		sum = sum + p;
	}
	
	
	if(sum == num)
	{
		printf("\n %d Is armstrong number", num);
	}
	else 
	{
		printf("\n %d Is NOT armstrong number", num);
	}
		
}	
	