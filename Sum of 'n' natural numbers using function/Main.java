#include<stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int s=sum(n);
  	return 0;
}
int sum(int m)
{
  int su=(m*(m+1))/2;
  printf("%d",su);
}