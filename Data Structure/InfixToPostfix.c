#include<stdio.h>
#include<string.h>

char Stack[100];
int top=-1;

void push(char p)
{
	top++;
	Stack[top]=p;
}

char pop()
{
	if(top==-1)
	{
		printf("Stack underflow!!!");
	}
	else
	{
		return(Stack[top--]);
	}
}

int priority(char p)
{
	if(p=='(')
	{return(0);}
	else if(p=='+'||p=='-')
	{return(1);}
	else if(p=='*'||p=='/')
	{return(2);}
	else if(p=='^')
	{return(3);}
}

int main()
{	
	int i=0,j=0;
	char Infix[50],ch,del;	

	printf("Enter the Expression :");
	scanf("%[^\n]",Infix);			
	printf("\nPostfix Expression : ");		
	push('(');
	for(i=0;i < strlen(Infix);i++)
	{
		if(Infix[i]==' ')
		{
			del = Infix[i];
		}
		else if(Infix[i]=='(') 
		{
			push(Infix[i]);
		}
		else if( Infix[i]=='+' || Infix[i]=='-' || Infix[i]=='*' || Infix[i]=='/' || Infix[i]==')' || Infix[i]=='^')
		{
			if( priority(Stack[top]) >= priority(Infix[i]))					
			{
				while(priority(Stack[top])>=priority(Infix[i]))
				{
					printf("%c",pop());
				}
				push(Infix[i]);
			}
			else if (Infix[i]==')')										
			{
				while(Stack[top]!='(')								
				{
					printf("%c",pop());
				}
				ch=pop();											
			}
			else 
			{
				push(Infix[i]);											
			}
		}	
		else
		{
			printf("%c",Infix[i]);
		}
	}
	while(top!=0)										
	{
		printf("%c",pop());
	}printf("\n");

	return(0);
}