#include<stdio.h>
int main()
{
  //Type your code here
  int r,c;
  scanf("%d",&r);
  scanf("%d",&c);
  int mat[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
  int t[c][r];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      t[j][i]=mat[i][j];
    }
  }
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      printf("%d ",t[i][j]);
    }
    printf("\n");
  }
             return 0;
}