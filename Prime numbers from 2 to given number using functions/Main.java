#include<stdio.h>
int p(int m);
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    if(p(i))
    {
      printf("%d\n",i);
    }
  }
    return 0;
}
int p(int m)
{
  int pr=1;
  for(int n=2;n<=m/2;n++)
  {
    if(m%n==0)
    {
      pr=0;
      break;
    }
  }
  return pr;
}