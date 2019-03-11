#include<stdio.h>
void solve(int n,char s,char a,char d);
int main()
{
	int n;
	printf("Enter The Number Of Rings::");
	scanf("%d",&n);
	solve(n,'A','B','C');
	return(0);
}

void solve(int n,char s,char a,char d)
{
	if(n==1)
	{
		printf("\nMove from %c to %c ",s,d);
	}
	else
	{
		solve(n-1,s,d,a);
		solve(1,s,a,d);
		solve(n-1,a,s,d);
	}
}