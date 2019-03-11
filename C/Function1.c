// Call by value does not change values out side the function...
#include<stdio.h>


void swapbyvalue(int a, int b)
{
 int temp;
 temp=a;
 a=b;
 b=temp;
}

void swapbyref(int *a, int *b)
{
 int temp;
 temp=*a;
 *a=*b;
 *b=temp;
}

void main() 
{  
 int a=100, b=200;  
 
 swapbyvalue(a, b);  
 printf("\nValue of a: %d",a);
 printf("\nValue of b: %d",b);
 
 swapbyref(&a, &b);  
 printf("\nValue of a: %d",a);
 printf("\nValue of b: %d",b);
 
}  