#include<stdio.h>
int main()
{
  int n,a[100],i=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a[i]=n%8;
    n/=8;
    i++;
  }
  for(int j=i-1; j>=0; j--)
  {
    printf("%d",a[j]);
  }//type your code here
  return 0;
}