#include<stdio.h>
int main()
{
  char c;
  scanf("%c",&c);
  if(c==65||c==97||c==69||c==101||c==73||c==105||c==79||c==11||c==85||c==117)
  {
    printf("Vowel");
  }
  else printf("Consonant");//type your code here
  return 0;
}