#include<stdio.h>
#include<stdlib.h>

char Queue[100];
int front=-1,rear=-1,size,i;

void enqueue(int p)
{
	if(rear == size-1)
	{
		printf("\nOVERFLOW !!!...");
	}
	else
	{
		Queue[rear++] = p;
        if(front==-1)
        {
            front++;
        }
	}
	
}

void dequeue()
{
	if(rear == -1)
	{
		printf("\nUNDERFLOW!!!");
	}
	else
	{
		front++;
	}
}
void display()
{
	for(i=front-1;i<rear;i++)
	{
		printf("%d ",Queue[i]);
	}
}

void main()
{
	int operation,a;
	char ch;

	printf("\nwhat size of Queue do you need :");
	scanf("%d",&size);

	printf("\nwhat operation do wish to perform:");
Read:
{
	printf("\n1. Enqueue\t2.dequeue \t3.display\t4. Exit :\t");
	scanf("%d",&operation);


switch(operation)
{
	case 1:
	{
		printf("\nEnter the element want to enqueue :");
		scanf("%d",&a);
		enqueue(a);
	Ask :
	{
		printf("\nDO YOU WISH TO PERFORM ANOTHER OPERATION(Y/N) :");
		scanf("%s",&ch);

		if(ch == 'y' || ch == 'Y')
		{
			goto Read;
		}
		else
		{
			display();
		}
	}
		break;
	}
	case 2:
	{
		dequeue();
		goto Ask;
	}
	case 3:
	{
		display();
		break;
	}
	case 4:
	{
		exit(0);
	}
	default:
	{
		printf("\nINVALID CHOCE OF OPERATION...");
		break;
	}
}
}
}