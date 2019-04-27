#include<stdio.h>
int main()
{
	//Try out your code here
  
	int r,c;
    scanf("%d %d", &r, &c);
    int matrix1[r][c];
    for(int i = 0; i < r; i++){
       for(int j = 0; j < c; j++){
           scanf("%d", &matrix1[i][j]);
       }
    }
   int matrix2[r][c];
    for(int i = 0; i < r; i++){
       for(int j = 0; j < c; j++){
           scanf("%d", &matrix2[i][j]);
       }
    }
  int flag=0;
  for(int i = 0; i < r; i++){
       for(int j = 0; j < c; j++){
         if(matrix1[i][j]!=matrix2[i][j])
         {
           flag=1;
           break;
         }
       }
  }
  if(flag==0)
  printf("Yes");
  else
    printf("No");
           
	return 0;
}