#include<stdio.h>
int main()
{
  int n,a,r,ts1,ts2,nth;
  scanf("%d",&n);
  if(n%2==0)
  {
    a=1,r=3;
   ts1=n/2;
    nth=a*pow(r,ts1-1);
  }
  else
  {
    a=1, r=2;
  ts2=(n+1)/2;
  nth=a*pow(r,ts2-1);
  }
  printf("%d",nth);
  return 0;
  
    
    
    
}