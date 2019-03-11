#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void main()
{
	float x1,x2,x3,y1,y2,y3,acc;
	int n,i,key;

	float y(float x)
	{
		return(4*x - exp(x));
	}
	
	printf("\nHOW YOU WISH TO SOLVE USING :");
	printf("\n1. ACCURACY\n");
	printf("\n2. ITERATONS\n");
	scanf("%d",&key);

switch(key)
{
case 1 :
{
 Read1 :
 {
	printf("\nENTER VALUES OF X1 AND X2 :\n");
	scanf("%f %f",&x1,&x2);
	printf("\nwhat accuracy do you want :\n");
	scanf("%f",&acc);

	y1 = y(x1);

	y2 = y(x2);
	

	printf("==============================================================");
	printf("\n\t X3   \t\t ITERATION  \n");
	printf("==============================================================");

	if((y1*y2) < 0)
	{
		for(i = 0;;i++)
		{
			x3 = ((x1*y(x2) - x2*y(x1))/(y(x2) - y(x1)));
			y3 = y(x3);

			if(abs(x1-x2) > acc)
			{
				

				if(y1*y3 < 0)
				{
					x2 = x3;
					y2 = y3;
					printf("\n\t %f \t\t  %d\n",x3,i+1);
					
				}
				else
				{
					x1 = x3;
					y1 = y3;
					printf("\n\t %f \t\t  %d\n",x3,i+1);				
				}

			}
			else
			{
				printf("\n\t %f \t\t  %d\n",x3,i+1);
				break;
			}
		}
	}
	else
	{
		goto Read1;
	}
 }	break;
}

case 2 :
{
 Read2 :
 {
	printf("\nENTER VALUES OF X1 AND X2 :\n");
	scanf("%f %f",&x1,&x2);
	printf("\nwhat number of iterations you need :\n");
	scanf("%d",&n);

	y1 = y(x1);
	printf("\n%f :\n",y1);
	y2 = y(x2);
	printf("\n%f :\n",y2);

	printf("==============================================================");
	printf("\n\t X3   \t\t ITERATION  \n");
	printf("==============================================================");

	if((y1*y2) < 0)
	{
		for(i=0;i<n;i++)
		{
			x3 = ((x1*y(x2) - x2*y(x1))/(y(x2) - y(x1)));
			y3 = y(x3);

			if(i < n)
			{
				

				if(y1*y3 < 0)
				{
					x2 = x3;
					y2 = y3;
					printf("\n\t %f \t\t  %d\n",x3,i+1);
					
				}
				else
				{
					x1 = x3;
					y1 = y3;
					printf("\n\t %f \t\t  %d\n",x3,i+1);				
				}

			}
			else
			{
				printf("\n\t %f \t\t  %d\n",x3,i+1);
				break;
				
			}
		}
	
	}
	else
	{
		goto Read2;
	}
 }	break;
}

}}
