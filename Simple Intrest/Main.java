#include<stdio.h>
int main()
{
  int t;
  float p;
  float r,si;
  scanf("%f",&p);
  scanf("%d",&t);
  scanf("%f",&r);
  si= (p*r*t)/100;
  printf("%f",si);
  return 0;
}