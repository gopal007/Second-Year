#include<stdio.h>

int main()
{
	int i,n,j,k,l,m;	
	float a=0,b=0,c=0,d=0,e=0,f=0,g=0,q;
	float A[10][10];
	
	printf("HOW MANY VALUES FOR X AND Y : ");
	scanf("%d",&n);
	
	float x[n]  , y[n],x_sqr[n],x_cube[n],x_4[n],x2_y[n],x_y[n];

	
	printf("\nENTER %d VALUES FOR X : ",n);
	for(i = 0 ; i< n ; i++)
	{
		scanf("%f",&x[i]);
		a = a +x[i];
	}
	
	printf("\nENTER %d VALUES FOR Y : ",n);
	for(i = 0 ; i< n ; i++)
	{
		scanf("%f",&y[i]);
		b = b +y[i];
	}
	
	for(i = 0 ; i< n ; i++)
	{
		x_sqr[i] = x[i] * x[i];
		c = c +  x_sqr[i]  ;
		
		x_cube[i]  =  x_sqr[i] * x[i] ;
		d  = d + x_cube[i] ;
		
		x_4[i]  =  x_cube[i]  * x[i] ;
		e = e + x_4[i]  ;
		
		x2_y[i]  = x_sqr[i] * y[i] ;
		f = f + 	x2_y[i] ;
		
		x_y[i] = x[i] * y[i] ;
		g = g  +  x_y[i] ;
		
	}
	
	printf("\t\tX\tY\tX_SQR\tX_CUBE\tX_POW_4\t\t(X_SQR)*_Y\tX*Y \n");
	for(i = 0 ; i< n ; i++)
	{
		printf("\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\t\t%.2f \n",x[i],y[i],x_sqr[i],x_cube[i],x_4[i],x2_y[i],x_y[i]);
	}
	
	printf("==============================================================================\n");
	printf("∑\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t\t%.2f\t%.2f \n",a,b,c,d,e,f,g);
	

	

	A[1][1] =   e   ;
	A[1][2] =  d    ;
	A[1][3] =   c   ;
	A[1][4] =   f   ;
	

	A[2][1] =   d   ;
	A[2][2] =   c   ;
	A[2][3] =    a  ;
	A[2][4] =    g  ;
	

	A[3][1] =   c   ;
	A[3][2] =    a  ;
	A[3][3] =    n  ;
	A[3][4] =    b  ;
												
	printf("\n MATRIX IS :\n");
	for(i = 1 ;i <=3 ; i++)
	{
		for(j = 1 ;j <= 4 ; j++)
		{
				printf("\t%.2f",A[i][j]);
		}
		printf("\n");
	}
		printf("\n\n");


	for( j =1 ;j<=3;j++)
	{
		for(i = 1;i<=3;i++)
		{
			if(i != j)
			{
				q = A[i][j] / A[j][j];
				for(k = 1;k<=4;k++)
				{
					
					A[i][k] = A[i][k] -  (q * A[j][k]);
				}
			}
		}
	}
	
	A[1][4] =  A[1][4]/ A[1][1] ;
	A[2][4] = A[2][4]/A[2][2] ;
	A[3][4] = A[3][4] /A[3][3] ;

	for(m=1;m<=3;m++)
	{
		printf("VALUE OF x%d = %.2f \n",m,A[m][4]);
	}
	
	printf("\nSOLUTION IS :     Y = %.2f*X^2  +%.2f * X  +  %.2f\n",A[1][4],A[2][4],A[3][4]);
	
		return 0;
}
	
	
	
	
	
	
	
	
	
