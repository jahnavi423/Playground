#include <stdio.h>
int main() {
	//Type your code
  int n,m,rem,res=0,i=0;
  scanf("%d",&m);
  n=m;
  while(n!=0)
  {
    n/=10;
    ++i;
  }
  n=m;
  while(n!=0)
  {
    rem=n%10;
    res+=pow(rem,i);
    n/=10;
  }
  if(res==m)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  
	return 0;
}