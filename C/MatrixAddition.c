#include<stdio.h>

void main()
{
	int m,n,p,q,i,j;
	
	printf("\nEnter No. of Rows and Columns for first Matrix :");
	scanf("%d %d",&m,&n);
	int M1[m][n];
	
	printf("\nEnter elements of 1st matrix :\n");

	for(i=0 ;i<m ; i++)
	{
		for(j=0 ;j<n ; j++)
		{
			scanf("%d",&M1[i][j]);
		}
	}
	
	printf("\nEnter No. of Rows and Columns for 2nd Matrix :\n");
	scanf("%d %d",&p,&q);
	int M2[p][q];
	
	if((m != p) && (n != q))
	{
		printf("Cannot Add the matrixes");
	}
	else
	{
		int M3[m][n];
		printf("\nEnter elements of 2nd matrix :\n");
		
	for(i=0 ;i<p ; i++)
		{
			for(j=0 ;j<q ; j++)
			{
				scanf("%d",&M2[i][j]);
			}
		}
		
		
	printf("\nAddition of matrixes is ::\n");
	
	for(i=0 ;i<m ; i++)
		{
			for(j=0 ;j<q ; j++)
			{
				M3[i][j] = M1[i][j] + M2[i][j];
				printf("%d ",M3[i][j]);
			}
			printf("\n");
		}
		
	}
	
}
