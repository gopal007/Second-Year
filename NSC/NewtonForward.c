#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n,i,j;
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
	yg=y[1];
	s=(xg-x[1])/h;


	for(i=1;i<=(n-1);i++)
	{
		for(j=1;j<=(n-i);j++)
		{
			y[j]=y[j+1]-y[j];
		}
		p=p*(s-i+1)/i;
		yg=yg+p*y[1];
	}
	printf("==========================\nVALUE OF y at %.2f is = %f",xg,yg);
}