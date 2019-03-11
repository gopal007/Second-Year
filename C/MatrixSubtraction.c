#include<stdio.h>

void main()
{
	int a,i,j;
	
	printf("\nEnter No. of Dimension for Matrices :");
	scanf("%d",&a);
	int M1[a][a];
	int M2[a][a];
	
	printf("\nEnter elements of 1st matrix :\n");

	for(i=0 ;i<a ; i++)
	{
		for(j=0 ;j<a ; j++)
		{
			scanf("%d",&M1[i][j]);
		}
	}
	

	
	

		int M3[a][a];
		printf("\nEnter elements of 2nd matrix :\n");
		
	for(i=0 ;i<a ; i++)
		{
			for(j=0 ;j<a ; j++)
			{
				scanf("%d",&M2[i][j]);
			}
		}
		
		
	printf("\n Subtraction of matrices is ::\n");
	
	for(i=0 ;i<a ; i++)
		{
			for(j=0 ;j<a ; j++)
			{
				M3[i][j] = M1[i][j] - M2[i][j];
				printf("%d ",M3[i][j]);
			}
			printf("\n");
		}
		
	
	
}
