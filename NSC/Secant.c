#include<stdio.h>
#include <stdlib.h>
#include<math.h>

float x,x1,x2,x3;

float y(float x)
{
	return((x*x*x)-(4*x)-9);
}

int main()
{
	int i,n;
	for(;;)
	{
		printf("ENTER TWO GUESS VALUES :");
		scanf("%f %f",&x1,&x2);
		
		if( ((y(x1)*y(x2)) < 0 ))
		{
			printf("Enter no of iterations :");
			scanf("%d",&n);
			break;
		}
		printf("\nWRONG GUESS VALUES...\n");
	}
	printf("     x1\t\ty1\t   x2\t     y2\t      x3\t    y3\n");

	for(i=0;i<n;i++)
	{
		x3=x1-((y(x1)*(x2-x1))/(y(x2)-y(x1)));
		printf("%f   %f   %f   %f   %f   %f\n",x1,y(x1),x2,y(x2),x3,y(x3));
		if( (y(x1)*y(x3)) > 0 )
		{
			x1=x3;
		}
		else
		{
			x2=x3;
		}	
	}
	printf("\nRoot of the Equation is %f \n",x3);
	return(0);
}