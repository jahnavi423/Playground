#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char t[100],wo[10],r[10],s[10][10];
  int i=0,j=0,k=0,w,p;
  gets(t);
  scanf("%s",wo);
  scanf("%s",r);
  p=strlen(t);
  for(k=0;k<p;k++)
  {
    if(t[k]!=' ')
    {
      s[i][j]=t[k];
      j++;
    }
    else
    {
      s[i][j]='\0';
      j=0;i++;
    }
  }
  s[i][j]='\0';
  w=i;
  for(i=0;i<=w;i++)
  {
    if(strcmp(s[i],wo)==0)
    
      strcpy(s[i],r);
    printf("%s ",s[i]);
  }
  return 0;
}