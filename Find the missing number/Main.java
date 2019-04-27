#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j,c,t,b;
  scanf("%d",&n);
  int array[n-1];
  for(i=0;i<n-1;i++)
  {
    scanf("%d",&array[i]);
  }
  b=array[0];
  for(i=1;i<n-1;i++)
    b=b^array[i];
  for(i=2,c=1;i<=n;i++)
  c=c^i;
  c=c^b;
  printf("%d",c);

  return 0;
}