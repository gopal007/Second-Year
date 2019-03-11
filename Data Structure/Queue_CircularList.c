#include<stdio.h>
#include<stdlib.h>

int x,i,len,operation;
struct node
{
	int data ;
	struct node *link ;
};

struct node *front = NULL ;
struct node *rear = NULL;

void enqueue(int x)
{
	struct node *temp;
	temp = (struct node*)malloc(sizeof(struct node)) ;
	temp->data = x ;
	
	if(front == NULL)
	{
		front = temp;
		rear = temp ;
		temp->link = front ;
	}
	else
	{
		struct node *p;
		p = front ;
		while(p->link != front)
		{
			p = p->link ;
		}
		p->link = temp ;
		temp->link = front ;
		rear = temp ;
	}
}

void dequeue()
{
	if(rear == NULL)
	{
		printf("\nUNDERFLOW...") ;
	}
	else if(rear == front)
	{
		struct node *temp ;
		temp = front;
		x = temp->data ;
		front = NULL ;
		rear = NULL ;
		free(front) ;
		printf("DELETED DATA IS : %d",x) ;
	}
	else
	{
		struct node *temp ;
		temp = front ;
		x = temp->data ;
		front = front->link ;
		rear->link = front ;
		free(temp) ;
		printf("DELETED DATA IS : %d",x) ;		
	}
}
	

void display()
{
	if(front ==NULL)
	{
		printf("\nQUEUE IS EMPTY...") ;
	}
	else
	{
		struct node *temp ;
		temp = front ;
		do
		{
			printf("%d-->",temp->data) ; 
			temp = temp->link ;
		}
		while(temp != front) ;
	}
}
void size()
{
	i = 0;
	if(front ==NULL)
	{}
	else
	{
		struct node *temp ;
		temp = front ;
		do
		{
			i++ ;
			temp = temp->link ;
		}
		while(temp != front) ;
	}
	printf("\nSIZE OF QUEUE IS : %d",i) ;
}


int main()
{
	while(1)
	{
		printf("\n\nOPERATIONS OF QUEUE-CIRCULAR-LINKED-LIST...") ; 
		printf("\n1.ENQUEUE\t2.DEQUEUE\t3.DISPLAY\t4.SIZE\t5.QUIT") ;
		printf("\nENTER YOUR CHOICE :") ; 
		scanf("%d",&operation) ; 
		
		switch(operation)
		{
			case 1 :
			{
				printf("\nENTER THE DATA : ") ;
				scanf("%d",&x) ;
				enqueue(x) ;
				break;
			}
			case 2 :
			{
				dequeue() ;
				
				break;
			}
			case 3 :
			{
				display() ; 
				break ;
			}
			case 4 :
			{
				size() ;
				break;
			}
			case 5 :
			{
				exit(0) ;
			}
			default :
			{
				printf("\nINVALID CHOICE OF OPERATION") ; 
				break ;
			}
		}
	}
	return 0;
}