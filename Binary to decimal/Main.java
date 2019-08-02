#include<stdio.h>
int main()
{
  long int n;
  scanf("%ld",&n);
  int i=0,sum=0,s;
  while(n!=0)
  {
    s=n%10;
    sum+=s*pow(2,i);
    n/=10;
    i++;
  }
  printf("%d",sum);
  return 0;
}