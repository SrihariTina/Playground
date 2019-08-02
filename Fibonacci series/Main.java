#include<stdio.h>
int main()
{
  int n,a[100];
  scanf("%d",&n);
  for(int i=2;i<=n-1;i++)
  {
    a[0]=0;
    a[1]=1;
    a[i]=a[i-1]+a[i-2];
  }
  for(int i=0;i<=n-1;i++)
  {
    printf("%d ",a[i]);
  }
  return 0;
}