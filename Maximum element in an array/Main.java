#include<stdio.h>
int main()
{
  	int num,max;
  scanf("%d",&num);
  int arr[num];
  for(int i=0;i<num;i++)
  {
    scanf("%d ",&arr[i]);
  }
  max=arr[0];
  for(int i=0;i<num;i++)
  {
     if(max<arr[i])
    {
      max=arr[i];
    }
  }
  printf("%d",max);
  return 0;
}