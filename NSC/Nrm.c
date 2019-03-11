#include<stdio.h>
#include<math.h>

	float y(float x)
	{
		return ((x*x*x) - (5*x) + 3);
	}
	
	float yd(float x)
	{
		return ((3*x*x) - 5);
	}

	float ydd(float x)
	{
		return (6*x);
	}

void main()
{

	int n,i,operation;
	float x1,x2,a,acc;
	
	printf("\nHOW DO YOU WISH TO SOLVE  ");
	printf("\n1. = USING ITERATION ");
	printf("\n2. = USING ACCURACY \n");
	scanf("%d",&operation);
switch(operation)
{

case 1 :
{
	printf("\nHOW MANY ITERARTIONS DO YOU WANT : ");
	scanf("%d",&n);

	Read1 :
	{
		printf("\nENTER THE GUESS VALUE : ");
		scanf("%f",&x1);

		a = ((y(x1)*ydd(x1))/(yd(x1)*yd(x1)));

		if(fabs(a) > 1)
		{
			goto Read1;
		}
		else
		{
			for(i = 1; i <= n; i++)
			{
				x2 = (x1 - (y(x1)/yd(x1)));
				x1 = x2;
				printf("\n %d iteration x = %f",i,x2);
			}
		}
	}
	break;
}

case 2 :
{
	printf("\nWHAT ACCURACY DO YOU WANT : ");
	scanf("%f",&acc);

	Read2 :
	{
		printf("\nENTER THE GUESS VALUE : ");
		scanf("%f",&x1);

		a = ((y(x1)*ydd(x1))/(yd(x1)*yd(x1)));

		if(fabs(a) > 1)
		{
			goto Read2;
		}
		else
		{
			for(i = 1;; i++)
			{
				x2 = (x1 - (y(x1)/yd(x1)));
				if(fabs(x1 - x2) < acc)
				{
					break;
				}
				x1 = x2;
				printf("\n %d iteration x = %f",i,x2);
			}
		}
	}
	break;
}


}

}
