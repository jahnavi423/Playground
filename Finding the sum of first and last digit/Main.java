#include <stdio.h>
int main() {
	//Type your code
  int n,fd,ld,s=0;
  scanf("%d",&n);
  ld=n%10;
  fd=n;
  while(n>=10)
  {
    n=n/10;
  }
  fd=n;
  s=fd+ld;
  printf("%d",s);
	return 0;
}