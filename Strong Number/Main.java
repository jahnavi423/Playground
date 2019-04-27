#include <stdio.h>
int main() {
	//Type your code
  int i,n,m,ld,s;
  long fact;
  scanf("%d",&m);
  n=m;
  s=0;
  while(m>0)
  {
    ld=m%10;
    fact=1;
    for(i=1;i<=ld;i++)
    {
      fact*=i;
    }
    s+=fact;
    m=m/10;
  }
  if(s==n)
  {
    printf("Yes");
  }
  else
    printf("No");
	return 0;
}