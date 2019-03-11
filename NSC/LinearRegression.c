#include<stdio.h>

int main()
{
	int i,n;
	
	printf("HOW MANY VALUES FOR X AND Y : ");
	scanf("%d",&n);
	
	float x[n],xmean=0,y[n],ymean=0,x_xmean[n],y_ymean[n],sqr_x_xmean[n],mul_2[n],a=0,b=0,c=0,d=0,A0,A1;
	
	printf("\nENTER %d VALUES FOR X : ",n);
	for(i = 0 ; i< n ; i++)
	{
		scanf("%f",&x[i]);
		xmean = xmean + x[i] ;
	}
	xmean = xmean/n ;
	
	printf("\nENTER %d VALUES FOR Y : ",n);
	for(i = 0 ; i< n ; i++)
	{
		scanf("%f",&y[i]);
		ymean = ymean + y[i] ;
	}
	ymean = ymean/n ;
	printf("\n");
	for(i = 0 ; i< n ; i++)
	{
		x_xmean[i] = x[i] - xmean;
		a = a + x_xmean[i] ;
		y_ymean[i] = y[i] - ymean;
		b = b + y_ymean[i] ;
		sqr_x_xmean[i] = x_xmean[i] * x_xmean[i];
		c = c + sqr_x_xmean[i] ;
		mul_2[i] = x_xmean[i] * y_ymean[i];
		d = d + mul_2[i] ;
	}
	
	printf("\t\tX\tY\tX-XMEAN\tY-YMEAN\tSQR(X-XMEAN)\tX-XMEAN * Y-YMEAN \n");
	for(i = 0 ; i< n ; i++)
	{
		printf("\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t\t%.2f \n",x[i],y[i],x_xmean[i],y_ymean[i],sqr_x_xmean[i],mul_2[i]);
	}
	printf("==================================================================================================\n");
	printf("∑\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t\t%.2f \n",xmean,ymean,a,b,c,d);
	
	A1 = d/c;
	A0 = ymean - A1*xmean ;
	
	printf("\nA0 = %.2f   A1 = %.2f",A0,A1);
	
	printf("\n\nY = %.2f + %.2fX\n",A0,A1);
	
	return 0;
}
