#include<stdio.h>
int main()
{
  //Type your code here
  int n,s=0,f,l;
  scanf("%d",&n);
  f=n;
  l=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  f=n;
  s=f+l;
  printf("%d",s);
  return 0;
}