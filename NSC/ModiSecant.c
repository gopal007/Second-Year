#include<stdio.h>
#include<stdlib.h>
#include<math.h>
float x;

float y(float x)
{	
	float c;
	c=pow(2.71828,-x);
	return(c-x);
}

int main()
{
	float x1,x2,n,d,m;
	printf("GIVEN EQUATION IS :: (e^-x)-x \n");
	printf("Enter the Value of x1 and d:");
	scanf("%f%f",&x1,&d);
	
	printf("\n   x1\t\ty(x1)\t  x2\t    y(x2)    \tabs(x1-x2)\n");
	
	do
	{
		m=x1+(d*x1);
		
		x2=x1-((d*x1*y(x1))/(y(m)-y(x1)));
		
		n=fabs(x1-x2);
		printf("%f   %f   %f   %f       %f\n",x1,y(x1),x2,y(x2),n);
		x1=x2;

	}while(n>d);

	printf("\nRoot of the Equation is %f \n",x1);

	return(0);

}
