#include<stdio.h>
int main()
{
  int a[100],n,s,i,d=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&s);
  for( i=0;i<n;i++)
  {
    if(a[i]==s) 
    {
      d=1;
      break;
    }
    
  }
  if(d==1) printf("%d",i+1);
  else printf("%d isn't present in the array.",s);
  
  
 return 0;

}