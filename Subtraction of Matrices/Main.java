#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c;
  scanf("%d",&r);
  scanf("%d",&c);
  int mat1[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&mat1[i][j]);
    }
  }
  int mat2[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&mat2[i][j]);
    }
  }
  int t[c][r];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      t[i][j]=mat1[i][j]-mat2[i][j];
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
	