#include<stdio.h>

enum week {sun, mon, tue, wed, thu, fri, sat};

void main()
{
	enum week today;
	today=tue;
	printf("%d day",today+1); 
 
}