#include<stdio.h>
#include<math.h>
int main()
{
  int a,b,c;
  float root, root1, dis,root2,realPart,imaginaryPart;
  scanf("%d%d%d",&a,&b,&c);
  dis= (b*b- 4*a*c);
  if(dis==0)
  {
    root= (float)(-b+sqrt(dis))/2*a;
    printf("root1 = %.2f  root2 = %.2f",root,root);
  }
  else if(dis>0)
  {
    root1= (float)(-b+sqrt(dis))/2*a;
    root2= (float)(-b-sqrt(dis))/2*a;
    printf("root1 = %.2f  root2 = %.2f",root1,root2);
  }
  else {
    realPart = (float)-b/(2*a);
    imaginaryPart = (float)sqrt(-dis)/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
    
  }
            
  return 0;
  
}