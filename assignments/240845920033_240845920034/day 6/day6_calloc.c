//Single Inheritance
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int * ptr;
    int n,i;
    n=5;
    printf("Enter no of elements %d\n",n);
    ptr=(int *)calloc(n,sizeof(int));
    if(ptr==NULL)
    {
        printf(" Memory not allocated \n");
    }
    else
    {
        printf("Memory allocated \n");
        for(i=0;i<n;i++)
        {
            ptr[i]=i+1;
        }
        printf("elements of array are : \n");
        for(i=0;i<n;i++)
        {
            printf("%d",ptr[i]);
        }
    }
}