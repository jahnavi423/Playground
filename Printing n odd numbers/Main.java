#include <stdio.h>
int main() {
	//Type your code
  int n,count=1;
  scanf("%d",&n);
  for(int temp=1,count=1;temp<=n;count=count+2,temp++)
  {
   
      printf("%d\n",count);
  }
	return 0;
}