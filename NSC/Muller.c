#include<stdio.h>
#include<math.h>
float fn(float a)
{
	return((a*a*a)-13*a-12);
}

int main()
{
	float p0,p1,p2,p3,h0,h1,h2,dis,root,a,b,c,d0,d1,z;
	int n,i;
	printf("GIVEN EQUATION IS : x^3-13x-12 \n Enter The 3 Initial guess: ");
	scanf("%f%f%f",&p1,&p2,&p3);
	
	printf("\nEnter The No Of Iterations::");
	scanf("%d",&n);
	
	printf("SOLUTION::\n================================================\n");
	printf("    Iter. No.\t\t   x3\n");
	for(i=0;i<n;i++)
	{
		h0=p1-p0;
		h1=p2-p1;

		d0=	(fn(p1)-fn(p0))/h0;
		d1=	(fn(p2)-fn(p1))/h1;
		
		a=(d1-d0)/(h0+h1);
		b=a*h1+d1;
		c=fn(p2);	

		dis=sqrt(b*b-4*a*c);
		
		if(b>0)
		{
			root=b+dis;
		}
		else
		{
			root=b-dis;
		}

		z=-2*c/root;
		p3=p2+z;
		
		printf("         %d\t\t%f\n",(i+1),p3);
		p0=p1;
		p1=p2;
		p2=p3;
		
	}
}
