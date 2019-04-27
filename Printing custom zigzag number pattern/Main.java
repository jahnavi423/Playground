#include <stdio.h>
int main() {
	// Type your code here
   int n;
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
    for(int c=1;c<=n;c++)
    {
      if((r%2==0)&&(c==1)||(r%2==1)&&(c==n))
           printf("%d",r+1);
      else
        printf("%d",r);
    }
    printf("\n");
  }
	return 0;
}