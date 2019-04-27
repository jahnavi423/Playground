#include<stdio.h>
int main()
{
  //fill the code
  int as;
  scanf("%d",&as);
  int a[10];
  for(int i=0;i<=as-1;i++)
  {
    scanf("%d",&a[i]);
  }
  int m;
  if(a[0]>a[1]) 
  {
    m=a[0];
  }
  else
  {
    m=a[1];
  }
  for(int i=2;i<=as-1;i++)
  {
    if(m<a[i])
    {
      m=a[i];
    }}
    printf("%d",m);
   
  
  return 0;
}