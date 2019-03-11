#include<stdio.h>
#include<stdlib.h>
void main()
{
	int **mat1, **mat2,**res,**mat3,i,j,k,r1,c1,r2,c2,sum = 0,operation;

	printf("\nEnter the Order of the matrix...\n");
	scanf("%d %d",&r1,&c1);
	
	mat1= (int**) malloc(r1*sizeof(int*));

	for(i=0;i<c1;i++)
	{
		mat1[i]=(int*)malloc(c1*sizeof(int));
	}
	
	printf("\nENTER ELEMENTS OF THE MATRIX :\n");
    for(i=0;i<r1;i++)
	{
        for(j=0;j<c1;j++)
		{
            scanf("%d",&mat1[i][j]);
		}
	}
	
	printf("\n\nWHAT OPERATION DO YOU WANT TO PERFORM :\n");
	printf("1. = MULTIPLICATION \t2. = ADDITION \t3. = TRANSPOSE \n");
	scanf("%d",&operation);
	
switch(operation)
{
case 1 :
	{
	
	printf("\nEnter the Order of the Second matrix...\n");
	scanf("%d %d",&r2,&c2);

	if(c1!=r2)
	{
		printf("Invalid Order of matrix");
		exit(0);
	}

	
	
	mat2= (int**) malloc(r2*sizeof(int*));

	for(i=0;i<c2;i++)
	{
		mat2[i]=(int*)malloc(c2*sizeof(int));
	}
	
	res=(int**)calloc(r1,sizeof(int*));

	for(i=0;i<c2;i++)
	{
		res[i]=(int*)calloc(c2,sizeof(int));
	}
	
	printf("\nENTER ELEMENTS OF 2nd MATRIX :\n");
    for(i=0;i<r2;i++)
	{
        for(j=0;j<c2;j++)
		{
            scanf("%d",&mat2[i][j]);
		}
	}

    for(i=0;i<r1;i++)
	{
        for(j=0;j<c2;j++)
		{
                
                for(k=0;k<c1;k++)
				{
                    sum += mat1[i][k]*mat2[k][j];
				}
				res[i][j]= sum ;
				sum = 0;
        }
        printf("\n");
    }


   printf("\nThe Multiplication of two matrix is\n");
   
   for(i=0;i<r1;i++)
   {
       printf("\n");
       for(j=0;j<c2;j++)
	    {
            printf("%d\t",res[i][j]);   
		}
   }
    printf("\n");
	break;
	}

	
case 2 :
	{
		printf("\nEnter the Order of the Second matrix...\n");
		scanf("%d %d",&r2,&c2);
		
	mat2= (int**) malloc(r2*sizeof(int*));

	for(i=0;i<c2;i++)
	{
		mat2[i]=(int*)malloc(c2*sizeof(int));
	}
	
	printf("\nENTER ELEMENTS OF 2nd MATRIX :\n");
    for(i=0;i<r2;i++)
	{
        for(j=0;j<c2;j++)
		{
            scanf("%d",&mat2[i][j]);
		}
	}
	
	res=(int**)calloc(r1,sizeof(int*));

	for(i=0;i<c2;i++)
	{
		res[i]=(int*)calloc(c2,sizeof(int));
	}
		
	for(i=0;i<r1;i++)
	{
        for(j=0;j<c2;j++)
		{
            res[i][j]=mat1[i][j]+mat2[i][j];
		}
	}


	printf("\nThe Addition of two matrix is\n");
	for(i=0;i<r1;i++)
	{
       printf("\n");
       for(j=0;j<c2;j++)
		{
            printf("%d\t",res[i][j]);
		}
    }
	printf("\n");
	break;
	}
	
case 3 :
	{
		
	mat3=(int**) malloc(sizeof(int*)*r1);
	for( i=0;i<r1;i++)
	{
		mat3[i]=(int *) malloc(sizeof(int)*c1);
	}

	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			mat3[i][j]=mat1[j][i];
		}
	}
	

	printf("\n Transpose of matrix is\n");
	
	for(i=0;i<c1;i++)
	{
		for(j=0;j<r1;j++)
		{
			printf("%d\t",mat3[i][j]);
		}
		printf("\n");
	}
	printf("\n");
	break;
	}
	
}
}