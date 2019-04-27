#include <stdio.h>
int main() {
	//Type your code
  int n,count=1;
  scanf("%d",&n);
  for(int temp=1;temp<=n;temp++)
  {
    if(count%2==1)
    {
      printf("%d\n",count);
    }
    count++;
  }
	return 0;
}