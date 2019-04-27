#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int k;
  scanf("%d",&k);
  int arr[10];
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&arr[i]);
  }
  int freq[k];
  for(int j=0;j<=k-1;j++)
  {
    freq[j]=0;
  }
  for(int i=0;i<=n-1;i++)
  {
    freq[arr[i]-1]++;
  }
  for(int i=0;i<=k-1;i++)
  {
    printf("%d %d\n",(i+1),freq[i]);
  }
  return 0;
}