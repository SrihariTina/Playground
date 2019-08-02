#include<stdio.h>

int main()
{
  long int n;
  int s,sum=0,oct=0,i=0;
  scanf("%ld",&n);
  while(n!=0)
  {
    s=n%10;
    sum=sum+(s*pow(2,i));
    n/=10;
    i++;
  }
  i=1;
  while(sum!=0)
  {
   
    oct=oct+(sum%8)*i;
    sum/=8;
    i*=10;
  }
  
    printf("%d",oct);
  return 0;
}