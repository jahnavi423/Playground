#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,s,p;
  scanf("%d",&a);
  b=a;
  s=a%10;
  while(a>=10)
  {
    a=a/10;
  }
  b=a;
  p=b+s;
  printf("%d",p);
  
  
  return 0;
}