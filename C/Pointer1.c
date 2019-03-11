#include <stdio.h>

void main()
{
    int x=100;
	int *ptr;

    // Prints address of x
    printf("%p\n", &x);
	ptr = &x;
	
	printf("%d\n", ptr);
	
	printf("%d\n", *ptr);
	
	*ptr = 300;
	printf("%d\n", x);
}