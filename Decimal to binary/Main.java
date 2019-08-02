#include<stdio.h>
int main()
{
 int n,a[1000],i=0;
  scanf("%d",&n);
while(n!=0)  {
    a[i]=n%2;
    n/=2;
    i++;  
  }
  for(int j=i-1;j>=0;j--)
  {
    printf("%d",a[j]);
  }
    
  return 0;
}