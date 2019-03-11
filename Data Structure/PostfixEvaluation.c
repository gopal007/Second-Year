#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char Stack[100];
int top=-1,val3;

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
	char Infix[50],String[50],ch,del;	

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
					String[j++] = pop();
				}
				push(Infix[i]);
			}
			else if (Infix[i]==')')										
			{
				while(Stack[top]!='(')								
				{
					String[j++] = pop();
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
			String[j++] = Infix[i];
		}
	}
	while(top!=0)										
	{
		String[j++] = pop();
	}String[j] = '\0';
	
	for(j=0;j < strlen(String);j++)
	{
		printf("%c",String[j]);
	}
	printf("\n");
	
	//=====================================================================
	top = -1;
    for (i = 0; i<strlen(String); i++)
    {
        if(String[i]=='+' || String[i]=='-' || String[i]=='*' || String[i]=='/')
        {
            int val2 = pop()-'0';
		printf("%d...",val2);
            int val1 = pop()-'0';

		printf("%d...",val1);
			
            switch (String[i])
            {
             case '+':
             {
             	val3 = val1+val2;
             	break;
             }
             case '-':
             {
             	val3 = val1-val2;
             	break;
             }
             case '*':
             {
             	val3 = val1*val2;
             	break;
             }
             case '/':
             {
             	val3 = val1/val2;
             	break;
             }
            }
	push(val3);	
        }
	else
	{
		push(String[i]);	 
	}
    }

	printf("\nANSWER IS : %d",val3);
	return(0);
}
