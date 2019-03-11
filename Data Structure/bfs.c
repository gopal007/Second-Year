#include<stdio.h>
#include<stdlib.h>

int Queue[100];
int front=-1,rear=-1;

void enqueue(int p,int size)
{
	
	Queue[++rear] = p;
    if(front==-1)
        ++front;
}

int dequeue()
{
	return Queue[front++];
}


struct vertex{
	char c ;
};

int main(){
	int i , j , size=6;
	int adjmat[6][6] = {{0,1,1,0,0,0},{1,0,0,0,0,0},{1,0,0,0,0,1},{0,1,0,0,1,0},{0,1,1,1,0,1},{0,0,1,0,1,0}};
	struct vertex array[6];

	for ( i = 0; i < size; ++i)
	{
		array[i].c = 'W';
	}

	enqueue(0,size);
	array[0].c = 'B';
	while(front != rear+1){
		i = dequeue();
		for ( j = 0; j < size; ++j)
		{
			if (adjmat[i][j] == 1 && array[j].c == 'W')
			{
				enqueue(j,size);
				array[j].c = 'B';
			}
		}
		printf("%d\n", i+1);
	}
	return 0;
}