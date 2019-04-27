#include<stdio.h>
int main()
{
  //Type your code here
  int i,c=0;
  int as;
  scanf("%d",&as);
  int a[20];
  for(int id=0;id<as;id++)
  {
    scanf("%d",&a[id]);
  }
  for(i=0;i<as;i++)
  {
    if(a[i]>0)
    {
      a[c++]=a[i];
    }
  }
  while(c<as)
  {
    a[c++]=0;
  }
  for(i=0;i<as;i++)
  {
    printf("%d ",a[i]);
  }
  return 0;
}