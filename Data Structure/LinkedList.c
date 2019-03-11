#include<stdio.h>
#include<stdlib.h>

int x,i,len,position,operation;
 

struct node 
{
  int data;
  struct node* link;
};

struct node* head = NULL;

void append(int x)
{
    struct node* temp;
    temp = (struct node*)malloc(sizeof(struct node));
    
    temp->data = x ;
    temp->link = NULL;
    
    if(head == NULL)
    {
    	head = temp;
    }
    else
    {
    	struct node* p ;
    	p = head ;

    	while(p->link != NULL)
    	{
    		p = p->link ;
    	}
    	p->link = temp;
    }
}

int length()
{
	int count=0;
	struct node* temp;
	temp = head;

	while(temp != NULL)
	{
		count++ ;
		temp = temp->link ;
	}
	return count;
}
 
void display()
{
	struct node* temp ;
	temp = head;
	if(temp == NULL)
	{
		printf("\nLIST IS EMPTY...");
	}
	else
	{
		printf("\n");
		while(temp != NULL)
		{
			printf("%d-->",temp->data);
			temp = temp->link;
		}
	}

}

void deleteAt(int position)
{
	if(head == NULL)
    {
        printf("\nLIST IS EMPTY...");
    }

	else if(position > length())
	{
		printf("\nNO NODE PRESENT AT THIS POSITION. . .  ");
	}
	else if(position == 1)
	{
        struct node* temp;
        temp = head;
		head = head->link;
        free(temp);
	}
    
	else
	{
		struct node* p ;
		struct node* temp ;
    	p = head ;
		temp = head;

    	for(i=1;i <= position-2;i++)
    	{
    		p = p->link ;
    	}
		for(i=1;i <= position;i++)
    	{
    		temp = temp->link ;
    	}
        free(p->link);
    	p->link = temp;
	}
}

void insertAt(int position)
{
    if((position) > (length()+1))
    {
        printf("\nPREVIOUS POSITIONS ARE YET TO BE FILLED...");
    }
    else
    {
        printf("\nENTER THE DATA : ");
        scanf("%d",&x);
	   struct node* p ;
	   p = head ;

	   struct node* temp1;
	   temp1 = head;
    
	   for(i=1;i <= position-1;i++)
   	    {
            temp1 = temp1->link ;
        }

	    struct node* temp;
        temp = (struct node*)malloc(sizeof(struct node));

        if(position == 1)
        {
            temp->data = x;
            temp->link = head;
            head = temp;
        }
        else
        {
            for(i=1;i <= position-2;i++)
            {
                p = p->link ;
            }
            p->link = temp;
            temp->data = x ;
            temp->link = temp1;
        }
    }
}

void reverse()
{
	int j,k,temp;
	i=0;
	struct node *p,*q;
	j= length()-1;
	p=head; q=head;
	while(i < j )
	{
		k=0;
		while(k<j)
		{
			q=q->link;
			k++;
		}
		temp = p->data;
		p->data = q->data;
		q->data = temp;
		i++;
		j--;
		p = p->link;
		q = head;
	}
}

void search(int x)
{
	struct node *temp1;
	temp1=head;
	int count=0,a=0;
	while(temp1!=NULL)
	{
		count++;
		if(temp1->data == x)
		{
			printf("Data %d is found at position %d\n",x,count);
			a=1;
			break;
		}
		temp1=temp1->link;
	} 
	if(a==0)
	printf("Data not found.....");
}
int main()
{

	while(1)
	{
		printf("\n\nLINKED LIST OPERATIONS :\n");
		printf("1.APPEND\t2.LENGTH\t3.DISPLAY\t4.DELETE_AT\t5.INSERT_AT\t6.REVERSE\t7.SEARCH\t8.QUIT");
		printf("\nENTER YOUR CHOICE : ");
		scanf("%d",&operation);
		
		
		switch(operation)
		{
			case 1 : 
			{
                printf("\nENTER THE DATA : ");
                scanf("%d",&x);
				append(x);
				break;
			}
			case 2 :
			{
				len = length();
				printf("\nLENGTH OF LIST IS : %d",len);
				break;
			} 
			case 3 : 
			{
				display();
				break;
			}
			case 4 : 
			{
                printf("\nWHICH NODE YOU WANT TO DELETE :");
	            scanf("%d",&position);
				deleteAt(position);
				break;
			}
			case 5 :
			{
                printf("\nWHERE DO YOU WANT TO INSERT A NODE :");
	            scanf("%d",&position);
				insertAt(position);
				break;
			}
			case 6 : 
			{
				reverse();
				break;
			}
			case 7 :
			{
				printf("\nENTER THE DATA YOU WANT SEARCH :");
				scanf("%d",&x);
				search(x);
				break;
			}
			case 8 : 
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
  	return 0;
}
