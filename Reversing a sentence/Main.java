#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 100
int main()
{
  // Type your code here
  char s[100],r[100];
  int i,l,ws,we,in;
  gets(s);
  l= strlen(s);
  in=0;
  ws=l-1;
  we=l-1;
  while(ws>0)
  {
    if(s[ws]==' ')
    {
      i=ws+1;
      while(i<=we)
      {
        r[in]=s[i];
        i++;
        in++;
      }
      r[in++]=' ';
      we=ws-1;
    }
    ws--;
  }
  for(i=0;i<=we;i++)
  {
    r[in]=s[i];
    in++;
  }
  r[in]='\0';
  printf("%s",r);
  return 0;
}