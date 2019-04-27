#include<stdio.h>
int main()
{
	//Try out your code here
  
	int r,c;
    scanf("%d %d", &r, &c);
    int matrix[r][c];
    for(int i = 0; i < r; i++){
       for(int j = 0; j < c; j++){
           scanf("%d", &matrix[i][j]);
       }
    }
  for(int k=0;k<c;k++)
  {
    for(int i=0,j=k;j<c;i++,j++)
    {
      printf("%d ",matrix[i][j]);
    }
  }
	return 0;
}