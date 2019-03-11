#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int operation,x,i,len,position; 

struct node 
{
	struct node* b_link;
	int data;
	struct node* f_link;
};

struct node* head = NULL;

void append(int x)
{
	struct node* temp ;
	temp = (struct node*)malloc(sizeof(struct node));
	
	temp->b_link = NULL;
	temp->data = x;
	temp->f_link = NULL;
	
	if(head == NULL)
	{
		head = temp;
	}
	else
	{
		struct node* p;
		p = head;
		
		while(p->f_link != NULL)
		{
			p = p->f_link ;
		}
		p->f_link = temp ;
		temp->b_link = p ;
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
		temp = temp->f_link ;
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
			temp = temp->f_link;
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
		head = head->f_link;
		head->b_link = NULL;
        free(temp);	
	}
	else if(position == length())
	{
		struct node* p ;
    	p = head ;
		
		for(i=1;i <= position-1;i++)
    	{
    		p = p->f_link ;
    	}
		p->b_link->f_link = NULL;
		free(p);
	}
	else
	{
		struct node* p ;
    	p = head ;

    	for(i=1;i <= position-1;i++)
    	{
    		p = p->f_link ;
    	}
		p->b_link->f_link = p->f_link;
		p->f_link->b_link = p->b_link;
		free(p);
	}
}

void insertAt(int position)
{
	if((position) > (length()+1))
    {
        printf("\nPREVIOUS POSITIONS ARE YET TO BE FILLED...");
    }
	else if(position == 1)
	{
		printf("\nENTER THE DATA : ");
        scanf("%d",&x);
		
		struct node* temp;
		temp = (struct node*)malloc(sizeof(struct node));
		
		temp->data = x;
		temp->b_link = NULL;
		temp->f_link = head;
		
		head = temp;
	}
	else
	{
		printf("\nENTER THE DATA : ");
        scanf("%d",&x);
		
		struct node *temp,*temp1 ;
		
		temp1 = (struct node*)malloc(sizeof(struct node));
	
		temp = head ;
		for(i=1;i <= position-1;i++)
   	    {
            temp = temp->f_link ;
        }
		temp->b_link->f_link = temp1;
		temp1->b_link = temp->b_link;
		temp->b_link = temp1;
		temp1->data = x;
		temp1->f_link = temp;
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
		temp1=temp1->f_link;;
	} 
	if(a==0)
	printf("Data not found.....");
}

int main()
{
	clock_t start,end,total;
	
	while(1)
	{
		printf("\n\nLINKED LIST OPERATIONS :\n");
		printf("1.APPEND\t2.LENGTH\t3.DISPLAY\t4.DELETE_AT\t5.INSERT_AT\t6.SEARCH\t7.QUIT\nENTER YOUR CHOICE : ");
		scanf("%d",&operation);
		
		switch(operation)
		{
			case 1 : 
			{
                printf("\nENTER THE DATA : ");
                scanf("%d",&x);
                start = clock();
				append(x);
				end = clock();
				total = (double)(end-start);
				printf("\nTime for this appending : %f",total);
				break;
			}
			case 2 :
			{
				start = clock();
				len = length();
				end = clock();
				printf("\nLENGTH OF LIST IS : %d",len);
				total = (double)(end-start);
				printf("\nTime for finding length : %f",total);
				break;
			} 
			case 3 : 
			{
				start = clock();
				display();
				end = clock();
				total = (double)(end-start);
				printf("\nTime for displaying : %f",total);
				break;
			}
			case 4 : 
			{
                printf("\nWHICH NODE YOU WANT TO DELETE :");
	            scanf("%d",&position);
	            start = clock();
				deleteAt(position);
				end = clock();
				total = (double)(end-start);
				printf("\nTime for this deletion : %f",total);
				break;
			}
			case 5 :
			{
                printf("\nWHERE DO YOU WANT TO INSERT A NODE :");
	            scanf("%d",&position);
	            start = clock();
				insertAt(position);
				end = clock();
				total = (double)(end-start);
				printf("\nTime for this insertion    : %f",total);

				break;
			}
			
			case 6 :
			{
				printf("\nENTER THE DATA YOU WANT SEARCH :");
				scanf("%d",&x);
				search(x);
				break;
			}
			case 7 : 
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
