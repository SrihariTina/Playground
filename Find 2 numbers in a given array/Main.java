#include<stdio.h>
int main()
{
  int num;
 
    int i,keynum1,keynum2, index1=-1,index2=-1;
    scanf("%d", &num);
    int array[num];
    for (i = 0; i < num; i++)
    {
        scanf("%d", &array[i]);
    }
    scanf("%d %d",&keynum1,&keynum2);
    for (i = 0; i < num ; i++)
    {
        if (array[i]==keynum1&&index1==-1)
        {
          index1=i;
          
        }
       if(array[i]==keynum2&&index2==-1)
       {
         index2=i;
       }
    }
  printf("Element 1 index = %d\n",index1);
  printf("Element 2 index = %d",index2);
    return 0;   
}