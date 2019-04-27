#include<stdio.h>
int pon(int b,int e);
int main(){
    // Type your code here
  int b,e;
  scanf("%d%d",&b,&e);
  printf("%d",pon(b,e));
  
  	return 0;
}
int pon (int b,int e)
{
  int p=1;
  while(e>=1)
  {
    p=p*b;
    e--;
  }
  return p;
}