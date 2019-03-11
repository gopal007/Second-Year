#include<stdio.h>

struct emp
{
	int id;
	char name[36];
	float sal;
	printf("Enter employee Id, Name, Salary: ");
};

void main()
{
	struct emp e;

	printf("Enter employee Id, Name, Salary: ");
	scanf("%d",&e.id);
	scanf("%s",&e.name);
	scanf("%f",&e.sal);

	printf("Id: %d",e.id);
	printf("\nName: %s",e.name);
	printf("\nSalary: %f",e.sal);

}