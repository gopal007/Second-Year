#include<stdio.h>
#include<stdlib.h>

int operation,x;

struct node 
{
	int data;
	struct node *link;
};

struct node *top ;

void push(int x)
{
	struct node *temp ;
	temp = (struct node*)malloc(sizeof(struct node)) ;
	temp->data = x ;
	
	if(top == NULL)
	{
		top = temp ;
		top->link = NULL ;
	}
	else
	{
		temp->link = top ;
		top = temp ;
	}
}

int pop()
{
	if(top == NULL)
	{
		printf("\nUNDERFLOW...");
	}
	else
	{
		struct node *temp ;
		temp = top ;
		x = temp->data ;
		top = top->link ;
		free(temp) ;
		return x;
	}
}

void display()
{
	if(top == NULL)
	{
		printf("\nSTACK IS EMPTY...") ;
	}
	else
	{
		struct node *temp ;
		temp = top ;
		while(1)
		{
			printf("%d-->",temp->data) ;
			temp = temp->link ;
			if(temp == NULL)
			{
				break;
			}
		}
	}
}

int size()
{
	struct node *temp ;
	temp = top ;
	x = 0 ;
	if(top == NULL);
	else
	{
		while(temp != NULL)
		{
			x++ ;
			temp = temp->link ;
		}
	}
	return x;
}


int main()
{
	
	
	while(1)
	{
		printf("\n\nSTACK OPERATIONS :\n");
		printf("1.PUSH\t2.POP\t3.DISPLAY\t4.SIZE\t5.QUIT");
		printf("\nENTER YOUR CHOICE : ");
		scanf("%d",&operation);
		
		switch(operation)
		{
			case 1 : 
			{
                printf("\nENTER THE DATA : ");
                scanf("%d",&x);
				push(x);
				break;
			}
			case 2 :
			{
				x = pop();
				printf("\nPOPED DATA IS : %d",x);
				break;
			} 
			case 3 : 
			{
				display();
				break;
			}
			case 4 : 
			{
				x = size();
				printf("\nSIZE OF STACK IS : %d",x);
				break;
			}
			case 5 :
			{
				exit(0);
			}
			default :
			{
				printf("\nINVALID CHOICE OF OPERATION. . .");
				break;
			}
		}
	}
}