#include<stdio.h>
int main()
{
  //Type your code here
  int N;
  scanf("%d",&N);
  int arr[20];
  int i;
  for(i=0;i<N;i++)
  {
    scanf("%d",&arr[i]);
  }
  int f[N];
  int m= Mostfreq(arr,N,f);
  printf("%d",m);
  return 0;
}
int Mostfreq (int arr[],int n,int f[])
{
  int mci=0;
  int cc=1;
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(arr[i]==arr[j])
        cc++;
    }
    f[i]=cc;cc=1;
  }
  for(int i=0;i<n;i++)
  {
    if(f[i]>f[mci])
    mci=i;
  }
  return arr[mci];
}