#include<stdio.h>


void main(int argc, char* argv[])
{
	int i;

	printf("Total number of arguments: %d",argc);
	for(i=0;i< argc;i++)
	{
		printf("\n %d argument: %s",i,argv[i]);
	}
}