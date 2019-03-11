#include<stdio.h>
#include<stdlib.h>
#include<time.h>
time_t t1,t2;
double total;
struct node{
	struct node *left ;
	int data ;
	struct node *right ;
};

struct node *root =NULL ;

void insert(int data){
	struct node *temp,*p ;
	temp = (struct node*)malloc(sizeof(struct node)) ;
	temp->data = data ;
	temp->left = temp->right = NULL ;
	p = root ;
	if(root == NULL){
		root = temp ;
	}
	else{
		struct node *current ;
		current = root ;
		while(current){
			p = current ;
			if(temp->data > current->data){
				current = current->right ;
			}
			else{
				current = current->left ;
			}
		}
		if(temp->data > p->data){p->right = temp ;}
		else{ p->left = temp ;}
	}}

void delete(int data){
	int value ;
	struct node *temp,*p,*q ;
	temp = root ;
	
	if(root == NULL){
		printf("\nTREE IS EMPTY . . .");
	}
	else{
		struct node *current ;
		current = root ;
		while(current){
			if(current->data == data){
				break;
			}
			p = current ;
			if(data > current->data){
				current = current->right ;
			}
			else if(data < current->data){
				current = current->left ;
			}
			else{
				printf("\nDATA NOT PRESENT  .  .  .") ;
				break;
			}
		}
		if((current->left == NULL) && (current->right == NULL)){       
			if(data > p->data){
				p->right = NULL ;
			}
			else {
				p->left = NULL ;
			}
			free(current) ;
		}
		
		if(((current->left == NULL)&&(current->right !=NULL)) || ((current->left != NULL)&&(current->right ==NULL))){
			if(current->right == NULL ){
				if(current == p->right){ 
					p->right = current->left ;
				}
				if(current == p->left){
					p->left = current->left ; 
				}
				current->left = NULL ;
			}
			if(current->left == NULL ){
				if(current == p->right){
					p->right = current->right ;
				}
				if(current == p->left){
					p->left = current->right ;
				}
				current->right = NULL ;
			}
			free(current) ;
		}
		
		if((current->left != NULL) && (current->right != NULL )){
			temp = current->right ;
			while(temp->left){
				q = temp ;
				temp = temp->left ;
			}
			if(temp == current->right ){
				if(temp->right != NULL ){
					value = temp->data ;
					current->data = value ;
					current->right = temp->right ;
					free(temp) ;
				}
				else{
					value = temp->data ;
					current->right = NULL ;
					current->data = value ;
					free(temp);
				}
			}
			else{
				value = temp->data ;
				q->left = NULL ;
				current->data = value ;
				free(temp) ;
			}
		}
	}}

void traversal(struct node *root){
	if(root==NULL){
		return;
	}
	traversal(root->left);
	printf(" %d ",root->data);
	traversal(root->right);
}



void main(){
	int x,operation;
	while(1){
		printf("\n1.INSERT\t2.DELETE\t3.TRAVERSAL\t4.QUIT\nENTER OPERATION : ") ;
		scanf("%d",&operation);
		
		switch(operation){
			case 1 :{
				printf("\nENTER DATA TO INSERT:") ;
				scanf("%d",&x);   
				t1 = clock();
				insert(x) ;    
				t2 = clock();
				total = (double)((t2 - t1)/CLOCKS_PER_SEC);
				printf("TIME TAKEN FOR THIS INSERTION : %f",total);
				break ;
			}
			case 2 :{
				printf("\nENTER DATA TO DELETE :") ;
				scanf("%d",&x) ;
				t1 = clock();
				delete(x) ;
				t2 = clock();
				total = (double)((t2 - t1)/CLOCKS_PER_SEC);
				printf("TIME TAKEN FOR THIS DELETION : %f",total);
				break;
			}
			case 3 :{
				t1 = clock();
				traversal(root) ;
				t2 = clock();
				total = (double)((t2 - t1));
				printf("TIME TAKEN FOR TRAVERSAL: %f",total);
				break ;
			}
			case 4 :{
				exit(0);
			}
			defaut :{
				printf("INVALID CHOICE...");
				break;
			}
		}}}