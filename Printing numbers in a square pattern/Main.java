#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
    for(int c=1;c<=n;c++)
    {
      printf("%d",r);
    }
    printf("\n");
  }
  	return 0;
}