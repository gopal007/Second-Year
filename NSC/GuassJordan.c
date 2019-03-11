#include<stdio.h>

int main()
{
	int n,i,j,k,l,m;	
	float a[10][10];
	float x[10];
	printf("\nEnter the no of Equations: ");
	scanf("%d",&n);
	
	printf("\nEnter The Coefficient of Equations:\n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=(n+1);j++)
		{
			scanf("%f",&a[i][j]);
		}	
	}

	for(k=1;k<=n;k++)
	{
		for(l=k+1;l<=n+1;l++)
		{
			a[k][l]=a[k][l]/a[k][k];
		}
		a[k][k]=1;

		for(i=1;i<=n;i++)
		{
			if(i!=k)
			{
				for(j=k+1;j<=n+1;j++)
				{
					a[i][j]=a[i][j]-(a[k][j]*a[i][k]);	
				}
			}
		}
	}

	for(m=1;m<=n;m++)
	{
		x[m]=a[m][n+1];
		printf("VALUE OF x%d = %f \n",m,x[m]);
	}
return(0);
}