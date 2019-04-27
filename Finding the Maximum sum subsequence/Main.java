#include<stdio.h>
int main()
{
  //Type your code here
  int N;
  scanf("%d",&N);
  int arr[20];
  int i,j;
  for(i=0;i<N;i++)
  {
    scanf("%d",&arr[i]);
  }
  printf("%d",ss(arr,N));
    return 0;
}
int ss(int arr[],int n)
{
  int rs,mss,i;
  rs=arr[0];
  mss=arr[0];
  for(i=1;i<n;i++)
  {
    if(arr[i]>arr[i-1])
    {
      rs+=arr[i];
    }
    else
      rs=arr[i];
    if(rs>mss)
      mss=rs;
  }
  return mss;
}