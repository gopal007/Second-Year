#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n,i,j,k;
	float *x,*y,xg,h,yg,p,s;
	printf("Enter The Number of Observations::");
	scanf("%d",&n);
	x= (float*)malloc((n+1)*sizeof(float));
	y= (float*)malloc((n+1)*sizeof(float));

	printf("Enter The Values of x::");
	for(i=1;i<=n;i++)
	{
		scanf("%f",&x[i]);
	}
	printf("Enter The Values of y::");
	for(i=1;i<=n;i++)
	{
		scanf("%f",&y[i]);
	}
	h=x[2]-x[1];
	printf("Enter The Value Of Xg::");
	scanf("%f",&xg);
	p=1;
	yg=y[n];
	s=(xg-x[n])/h;


	for(i=n,k=1;i>=1,k<n;i--,k++)
	{
		for(j=n;j>=1;j--)
		{
			y[j]=y[j]-y[j-1];
		}
		p=p*(s+k-1)/k;
		yg=yg+p*y[n];
	}
	printf("==========================\nVALUE OF y at %.2f is = %f",xg,yg);
}