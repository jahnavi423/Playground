#include<stdio.h>
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int s=sq(n);
   return 0;
}
int sq(int m)
{
  int sqr=m*m;
  printf("%d",sqr);
}